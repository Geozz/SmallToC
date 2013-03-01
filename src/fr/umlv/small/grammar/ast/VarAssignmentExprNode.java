package fr.umlv.small.grammar.ast;

public class VarAssignmentExprNode extends AbstractLocatable implements ExprNode {
  private final String name;
  private final ExprNode expr;
  
  VarAssignmentExprNode(String name, ExprNode expr, Locatable locatable) {
    super(locatable);
    this.name = name;
    this.expr = expr;
  }
  
  public String getName() {
    return name;
  }
  public ExprNode getExpr() {
    return expr;
  }
  
  @Override
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data) {
    return visitor.visitVarAssignment(this, data);
  }
}
