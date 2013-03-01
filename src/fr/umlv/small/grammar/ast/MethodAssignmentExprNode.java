package fr.umlv.small.grammar.ast;

public class MethodAssignmentExprNode extends AbstractLocatable implements ExprNode {
  private final ExprNode receiver;
  private final String methodName;
  private final ExprNode expr;

  MethodAssignmentExprNode(ExprNode receiver, String methodName, ExprNode expr, Locatable locatable) {
    super(locatable);
    this.receiver = receiver;
    this.methodName = methodName;
    this.expr = expr;
  }
  
  public ExprNode getReceiver() {
    return receiver;
  }
  public String getMethodName() {
    return methodName;
  }
  public ExprNode getExpr() {
    return expr;
  }

  @Override
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data) {
    return visitor.visitMethodAssignment(this, data);
  }
}
