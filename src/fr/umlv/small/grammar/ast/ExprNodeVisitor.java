package fr.umlv.small.grammar.ast;

public interface ExprNodeVisitor<D, R> {
  public R visitConst(ConstExprNode node, D data);
  public R visitUnary(UnaryExprNode node, D data) ;
  public R visitBinary(BinaryExprNode node, D data);
  public R visitIf(IfExprNode node, D data);
  public R visitIs(IsExprNode node, D data);
  public R visitVarAccess(VarAccessExprNode node, D data);
  public R visitVarAssignment(VarAssignmentExprNode node, D data);
  public R visitFieldAccess(FieldAccessExprNode node, D data);
  public R visitFunctionCall(FunctionCallExprNode node, D data);
  public R visitMethodCall(MethodCallExprNode node, D data);
  public R visitMethodAssignment(MethodAssignmentExprNode node, D data);
  public R visitInstanceAllocation(InstanceAllocationExprNode node, D data);
}
