package fr.umlv.small.interpreter.smallToC;

import java.util.Map;

import fr.umlv.small.grammar.ast.BinaryExprNode;
import fr.umlv.small.grammar.ast.ConstExprNode;
import fr.umlv.small.grammar.ast.ConstExprNode.ConstKind;
import fr.umlv.small.grammar.ast.ExprNodeVisitor;
import fr.umlv.small.grammar.ast.FieldAccessExprNode;
import fr.umlv.small.grammar.ast.FunctionCallExprNode;
import fr.umlv.small.grammar.ast.IfExprNode;
import fr.umlv.small.grammar.ast.InstanceAllocationExprNode;
import fr.umlv.small.grammar.ast.IsExprNode;
import fr.umlv.small.grammar.ast.MethodAssignmentExprNode;
import fr.umlv.small.grammar.ast.MethodCallExprNode;
import fr.umlv.small.grammar.ast.UnaryExprNode;
import fr.umlv.small.grammar.ast.VarAccessExprNode;
import fr.umlv.small.grammar.ast.VarAssignmentExprNode;

public class KindVisitor implements ExprNodeVisitor<Map<String, ConstKind>, ConstKind> {
	@Override
	public ConstKind visitVarAssignment(VarAssignmentExprNode node, Map<String, ConstKind> data) {
		return node.getExpr().accept(this, data);
	}

	@Override
	public ConstKind visitVarAccess(VarAccessExprNode node, Map<String, ConstKind> data) {
		ConstKind constKind = data.get(node.getName());
		if (constKind == null) {
			throw new UnsupportedOperationException();
		}
		return constKind;
	}

	@Override
	public ConstKind visitUnary(UnaryExprNode node, Map<String, ConstKind> data) {
		return node.getExpr().accept(this, data);
	}

	@Override
	public ConstKind visitMethodCall(MethodCallExprNode node, Map<String, ConstKind> data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConstKind visitMethodAssignment(MethodAssignmentExprNode node, Map<String, ConstKind> data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConstKind visitIs(IsExprNode node, Map<String, ConstKind> data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConstKind visitInstanceAllocation(InstanceAllocationExprNode node, Map<String, ConstKind> data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConstKind visitIf(IfExprNode node, Map<String, ConstKind> data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConstKind visitFunctionCall(FunctionCallExprNode node, Map<String, ConstKind> data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConstKind visitFieldAccess(FieldAccessExprNode node, Map<String, ConstKind> data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConstKind visitConst(ConstExprNode node, Map<String, ConstKind> data) {
		return node.getKind();
	}

	@Override
	public ConstKind visitBinary(BinaryExprNode node, Map<String, ConstKind> data) {
		// TODO Auto-generated method stub
		return null;
	}
}
