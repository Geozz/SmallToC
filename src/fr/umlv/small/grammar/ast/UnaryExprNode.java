package fr.umlv.small.grammar.ast;

public class UnaryExprNode extends AbstractLocatable implements ExprNode {
  public enum UnaryKind {
    PLUS,
    MINUS,
    NOT
  }

  private final UnaryKind kind;
  private final ExprNode expr;
  
  UnaryExprNode(UnaryKind kind, ExprNode expr, Locatable locatable) {
    super(locatable);
    this.kind = kind;
    this.expr = expr;
  }
  
  public UnaryKind getKind() {
    return kind;
  }
  public ExprNode getExpr() {
    return expr;
  }
  
  @Override
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data) {
    return visitor.visitUnary(this, data);
  }
}
