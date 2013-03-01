package fr.umlv.small.grammar.ast;

public class FieldAccessExprNode extends AbstractLocatable implements ExprNode {
  private final ExprNode expr;
  private final String fieldName;
  
  FieldAccessExprNode(ExprNode expr, String fieldName, Locatable locatable) {
    super(locatable);
    this.fieldName = fieldName;
    this.expr = expr;
  }
  
  public String getFieldName() {
    return fieldName;
  }
  public ExprNode getExpr() {
    return expr;
  }
  
  @Override
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data) {
    return visitor.visitFieldAccess(this, data);
  }
}
