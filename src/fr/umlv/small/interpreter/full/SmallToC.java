package fr.umlv.small.interpreter.full;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import fr.umlv.small.grammar.ast.BinaryExprNode;
import fr.umlv.small.grammar.ast.ClassDefNode;
import fr.umlv.small.grammar.ast.ConstExprNode;
import fr.umlv.small.grammar.ast.ConstExprNode.ConstKind;
import fr.umlv.small.grammar.ast.ExprNode;
import fr.umlv.small.grammar.ast.ExprNodeVisitor;
import fr.umlv.small.grammar.ast.FieldAccessExprNode;
import fr.umlv.small.grammar.ast.FieldDefNode;
import fr.umlv.small.grammar.ast.FieldInitNode;
import fr.umlv.small.grammar.ast.FunctionCallExprNode;
import fr.umlv.small.grammar.ast.FunctionDefNode;
import fr.umlv.small.grammar.ast.IfExprNode;
import fr.umlv.small.grammar.ast.InstanceAllocationExprNode;
import fr.umlv.small.grammar.ast.IsExprNode;
import fr.umlv.small.grammar.ast.MethodAssignmentExprNode;
import fr.umlv.small.grammar.ast.MethodCallExprNode;
import fr.umlv.small.grammar.ast.ScriptNode;
import fr.umlv.small.grammar.ast.UnaryExprNode;
import fr.umlv.small.grammar.ast.VarAccessExprNode;
import fr.umlv.small.grammar.ast.VarAssignmentExprNode;
import fr.umlv.small.interpreter.InterpreterException;
import fr.umlv.small.interpreter.writer.CWriter;

public class SmallToC {
	private final Map<String, Clazz> classMap;
	private final HashMap<String, FunctionDefNode> functionDefMap;
	private final HashMap<String, ConstKind> varKindMap = new HashMap<>();
	private final CWriter writer;

	// helper method
	static InterpreterException reportError(int position, String message, Object... arguments) {
		return new InterpreterException(String.format(message, arguments) + " at line " + position);
	}
	
	private SmallToC(Map<String, Clazz> classMap, HashMap<String, FunctionDefNode> functionDefMap, CWriter writer) {
	  this.classMap = classMap;
	  this.functionDefMap = functionDefMap;
	  this.writer = writer;
  }
	
	public static SmallToC createSmallToC(ScriptNode script, PrintStream ps) {
		HashMap<String, Clazz> classMap = new HashMap<>();
		// create all classes
		for (ClassDefNode classDef : script.getClasses()) {
			String className = classDef.getName();
			classMap.put(className, new Clazz(className, classDef));
		}
		// add fields
		for (ClassDefNode classDef : script.getClasses()) {
			Clazz clazz = classMap.get(classDef.getName());
			for (FieldDefNode fieldDef : classDef.getFields()) {
				clazz.addField(fieldDef.getFieldName());
			}
		}

		HashMap<String, FunctionDefNode> functionDefMap = new HashMap<>();
		for (FunctionDefNode function : script.getFunctions()) {
			functionDefMap.put(function.getName(), function);
		}
		return new SmallToC(classMap, functionDefMap, new CWriter(ps));
	}
	
	static class Env {
		final Map<String, Integer> varMap;

		Env(Map<String, Integer> varMap) {
			this.varMap = varMap;
		}
	}

	public void start() {
		for (Entry<String, FunctionDefNode> entry: functionDefMap.entrySet()) {
			if (!entry.getKey().equals("main")) {
				rewrite(entry.getValue());
			}
		}
		
		FunctionDefNode mainDefNode = functionDefMap.get("main");
		rewrite(mainDefNode);
  }

	public Function rewrite(FunctionDefNode functionDef) {
		LinkedHashSet<String> varNames = new LinkedHashSet<>();
		// add parameters
		varNames.addAll(functionDef.getParameters());
		// find and add all declared variables
		declaredVarNames(functionDef.getExprs(), varNames);

		// number all local variables
		HashMap<String, Integer> varMap = new HashMap<>();
		for (String varName : varNames) {
			varMap.put(varName, varMap.size());
		}

		writer.writeSignature(functionDef.getName(), functionDef.getParameters().size());
		
		Env env = new Env(varMap);
		rewriteBlock(functionDef.getExprs(), env);
		
		writer.writeEndBlock();

		Function function = new Function(functionDef);
		return function;
	}
	
	private void rewriteBlock(List<ExprNode> exprs, Env env) {
		for(int i=0; i < exprs.size(); i++) {
      ExprNode expr = exprs.get(i);
      if (i == exprs.size() - 1) {
      	writer.writeReturn();
      }
      rewriteExpr(expr, env);
    }
		if (exprs.isEmpty()) {
			writer.writeSimpleReturn();
		}
  }
	
	private Void rewriteExpr(ExprNode expr, Env env) {
		return expr.accept(exprVisitor, null);
	}

	static void declaredVarNames(List<ExprNode> exprs, Set<String> declaredVars) {
		for (ExprNode expr : exprs) {
			expr.accept(DECLARED_VAR_VISITOR, declaredVars);
		}
	}
	
	private final ExprNodeVisitor<Void, Void> exprVisitor = new ExprNodeVisitor<Void, Void>() {

		@Override
    public Void visitConst(ConstExprNode node, Void data) {
			switch(node.getKind()) {
			case INTEGER:
				writer.writeIntegerConst(node.getValue());
				break;
			case BOOL:
				writer.writeBoolConst(node.getValue());
				break;
			default: //case TEXT:
				writer.writerConstText(node.getValue());
				break;
			}
	    return null;
    }

		@Override
    public Void visitUnary(UnaryExprNode node, Void data) {
	    // TODO Auto-generated method stub
	    return null;
    }

		@Override
    public Void visitBinary(BinaryExprNode node, Void data) {
	    // TODO Auto-generated method stub
	    return null;
    }

		@Override
    public Void visitIf(IfExprNode node, Void data) {
	    // TODO Auto-generated method stub
	    return null;
    }

		@Override
    public Void visitIs(IsExprNode node, Void data) {
	    // TODO Auto-generated method stub
	    return null;
    }

		@Override
    public Void visitVarAccess(VarAccessExprNode node, Void data) {
	    writer.writeVarAccess(node.getName());
	    return null;
    }

		@Override
    public Void visitVarAssignment(VarAssignmentExprNode node, Void data) {
			String name = node.getName();
			ConstKind old = varKindMap.put(name, node.getExpr().accept(kindVisitor, null));
			ConstKind newType = varKindMap.get(name);
			if (old == null || !old.equals(newType)) {
				writer.writeType(newType);
			}
	    writer.writeBeginAssignement(name);
	    node.getExpr().accept(this, data);
	    writer.writeEndAssignement();
	    return null;
    }

		@Override
    public Void visitFieldAccess(FieldAccessExprNode node, Void data) {
	    // TODO Auto-generated method stub
	    return null;
    }

		@Override
    public Void visitFunctionCall(FunctionCallExprNode node, Void data) {
			List<ExprNode> arguments = node.getArguments();
			if (node.getName().equals("print")) {
				List<String> types = new ArrayList<>();
				for (ExprNode expr: arguments) {
					expr.accept(printVisitor, types);
				}
				writer.writePrintf(types);
				for (int i = 0; i < arguments.size(); i++) {
					arguments.get(i).accept(this, data);
					if (i != arguments.size() - 1) {
						writer.writeComma();
						writer.writeSpace();
					}
				}
				writer.writeEndFunctionCall();
				return null;
			}
			
			writer.writeBeginFunctionCall(node.getName());
			for (ExprNode expr: arguments) {
				expr.accept(this, data);
			}
			writer.writeEndFunctionCall();
	    return null;
    }

		@Override
    public Void visitMethodCall(MethodCallExprNode node, Void data) {
	    // TODO Auto-generated method stub
	    return null;
    }

		@Override
    public Void visitMethodAssignment(MethodAssignmentExprNode node, Void data) {
	    // TODO Auto-generated method stub
	    return null;
    }

		@Override
    public Void visitInstanceAllocation(InstanceAllocationExprNode node, Void data) {
	    // TODO Auto-generated method stub
	    return null;
    }

	};

	private final ExprNodeVisitor<Void, ConstKind> kindVisitor = new ExprNodeVisitor<Void, ConstExprNode.ConstKind>() {
		
		@Override
		public ConstKind visitVarAssignment(VarAssignmentExprNode node, Void data) {
			return node.getExpr().accept(this, data);
		}
		
		@Override
		public ConstKind visitVarAccess(VarAccessExprNode node, Void data) {
			ConstKind constKind = varKindMap.get(node.getName());
			if (constKind == null) {
				throw new UnsupportedOperationException();
			}
			return constKind;
		}
		
		@Override
		public ConstKind visitUnary(UnaryExprNode node, Void data) {
			return node.getExpr().accept(this, data);
		}
		
		@Override
		public ConstKind visitMethodCall(MethodCallExprNode node, Void data) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ConstKind visitMethodAssignment(MethodAssignmentExprNode node, Void data) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ConstKind visitIs(IsExprNode node, Void data) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ConstKind visitInstanceAllocation(InstanceAllocationExprNode node, Void data) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ConstKind visitIf(IfExprNode node, Void data) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ConstKind visitFunctionCall(FunctionCallExprNode node, Void data) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ConstKind visitFieldAccess(FieldAccessExprNode node, Void data) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ConstKind visitConst(ConstExprNode node, Void data) {
			return node.getKind();
		}
		
		@Override
		public ConstKind visitBinary(BinaryExprNode node, Void data) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	private final ExprNodeVisitor<List<String>, Void> printVisitor = new ExprNodeVisitor<List<String>, Void>() {

		private Void visitBlock(List<ExprNode> exprs, List<String> data) {
			for (ExprNode expr : exprs) {
				expr.accept(this, data);
			}
			return null;
		}
		
		@Override
    public Void visitConst(ConstExprNode node, List<String> data) {
	    ConstKind kind = node.getKind();
			constHelper(data, kind);
	    return null;
    }

		private void constHelper(List<String> data, ConstKind kind) {
	    switch (kind) {
	    case INTEGER:
	    case BOOL:
	    	data.add("%d");
	    	break;
	    default: //case TEXT:
	    	data.add("%s");
	    	break;
	    }
		}

		@Override
    public Void visitUnary(UnaryExprNode node, List<String> data) {
	    node.getExpr().accept(this, data);
	    return null;
    }

		@Override
    public Void visitBinary(BinaryExprNode node, List<String> data) {
	    node.getLeftExpr().accept(this, data);
	    node.getRightExpr().accept(this, data);
	    return null;
    }

		@Override
    public Void visitIf(IfExprNode node, List<String> data) {
	    node.getConditionExpr().accept(this, data);
	    visitBlock(node.getThenExprs(), data);
	    visitBlock(node.getElseExprs(), data);
	    return null;
    }

		@Override
    public Void visitIs(IsExprNode node, List<String> data) {
	    node.getExpr().accept(this, data);
	    return null;
    }

		@Override
    public Void visitVarAccess(VarAccessExprNode node, List<String> data) {
	    ConstKind constKind = varKindMap.get(node.getName());
	    constHelper(data, constKind);
	    return null;
    }

		@Override
    public Void visitVarAssignment(VarAssignmentExprNode node, List<String> data) {
	    node.getExpr().accept(this, data);
	    return null;
    }

		@Override
    public Void visitFieldAccess(FieldAccessExprNode node, List<String> data) {
	    // TODO Auto-generated method stub
	    return null;
    }

		@Override
    public Void visitFunctionCall(FunctionCallExprNode node, List<String> data) {
	    // TODO Auto-generated method stub
	    return null;
    }

		@Override
    public Void visitMethodCall(MethodCallExprNode node, List<String> data) {
	    // TODO Auto-generated method stub
	    return null;
    }

		@Override
    public Void visitMethodAssignment(MethodAssignmentExprNode node, List<String> data) {
	    // TODO Auto-generated method stub
	    return null;
    }

		@Override
    public Void visitInstanceAllocation(InstanceAllocationExprNode node, List<String> data) {
	    // TODO Auto-generated method stub
	    return null;
    }
	};
	
	private static final ExprNodeVisitor<Set<String>, Void> DECLARED_VAR_VISITOR = new ExprNodeVisitor<Set<String>, Void>() {
		@Override
		public Void visitConst(ConstExprNode node, Set<String> data) {
			return null;
		}

		@Override
		public Void visitUnary(UnaryExprNode node, Set<String> data) {
			node.getExpr().accept(this, data);
			return null;
		}

		@Override
		public Void visitBinary(BinaryExprNode node, Set<String> data) {
			node.getLeftExpr().accept(this, data);
			node.getRightExpr().accept(this, data);
			return null;
		}

		@Override
		public Void visitIf(IfExprNode node, Set<String> data) {
			node.getConditionExpr().accept(this, data);
			declaredVarNames(node.getThenExprs(), data);
			declaredVarNames(node.getElseExprs(), data);
			return null;
		}

		@Override
		public Void visitIs(IsExprNode node, Set<String> data) {
			node.getExpr().accept(this, data);
			return null;
		}

		@Override
		public Void visitVarAccess(VarAccessExprNode node, Set<String> data) {
			data.add(node.getName());
			return null;
		}

		@Override
		public Void visitVarAssignment(VarAssignmentExprNode node, Set<String> data) {
			node.getExpr().accept(this, data);
			data.add(node.getName());
			return null;
		}

		@Override
		public Void visitFieldAccess(FieldAccessExprNode node, Set<String> data) {
			node.getExpr().accept(this, data);
			return null;
		}

		@Override
		public Void visitFunctionCall(FunctionCallExprNode node, Set<String> data) {
			declaredVarNames(node.getArguments(), data);
			return null;
		}

		@Override
		public Void visitMethodCall(MethodCallExprNode node, Set<String> data) {
			node.getReceiver().accept(this, data);
			declaredVarNames(node.getArguments(), data);
			return null;
		}

		@Override
		public Void visitMethodAssignment(MethodAssignmentExprNode node, Set<String> data) {
			node.getReceiver().accept(this, data);
			node.getExpr().accept(this, data);
			return null;
		}

		@Override
		public Void visitInstanceAllocation(InstanceAllocationExprNode node, Set<String> data) {
			for (FieldInitNode initNode : node.getFieldInits()) {
				initNode.getExpr().accept(this, data);
			}
			return null;
		}
	};

	public void writeHeaders() {
	  writer.writeHeaders();
  }
}
