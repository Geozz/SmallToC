package fr.umlv.small.interpreter.smallToC;

import java.util.Set;

import fr.umlv.small.grammar.ast.BinaryExprNode;
import fr.umlv.small.grammar.ast.ConstExprNode;
import fr.umlv.small.grammar.ast.ExprNodeVisitor;
import fr.umlv.small.grammar.ast.FieldAccessExprNode;
import fr.umlv.small.grammar.ast.FieldInitNode;
import fr.umlv.small.grammar.ast.FunctionCallExprNode;
import fr.umlv.small.grammar.ast.IfExprNode;
import fr.umlv.small.grammar.ast.InstanceAllocationExprNode;
import fr.umlv.small.grammar.ast.IsExprNode;
import fr.umlv.small.grammar.ast.MethodAssignmentExprNode;
import fr.umlv.small.grammar.ast.MethodCallExprNode;
import fr.umlv.small.grammar.ast.UnaryExprNode;
import fr.umlv.small.grammar.ast.VarAccessExprNode;
import fr.umlv.small.grammar.ast.VarAssignmentExprNode;

import static fr.umlv.small.interpreter.smallToC.SmallToC.declaredVarNames;

public class VarVisitor implements ExprNodeVisitor<Set<String>, Void> {

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
}
