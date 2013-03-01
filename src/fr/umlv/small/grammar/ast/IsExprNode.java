package fr.umlv.small.grammar.ast;

public class IsExprNode extends AbstractLocatable implements ExprNode {
  private final ExprNode expr;
  private final String typeName;

  IsExprNode(ExprNode expr, String typeName) {
    super(expr);
    this.expr = expr;
    this.typeName = typeName;
  }

  public ExprNode getExpr() {
    return expr;
  }
  public String getTypeName() {
    return typeName;
  }
  
  @Override
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data) {
    return visitor.visitIs(this, data);
  }
}
