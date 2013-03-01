package fr.umlv.small.grammar.ast;

public class FieldInitNode extends AbstractLocatable implements Node {
  private final String fieldName;
  private final ExprNode expr;

  FieldInitNode(String fieldName, ExprNode expr, Locatable locatable) {
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
}
