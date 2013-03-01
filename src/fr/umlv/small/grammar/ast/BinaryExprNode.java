package fr.umlv.small.grammar.ast;

public class BinaryExprNode extends AbstractLocatable implements ExprNode {
  public enum BinaryKind {
    ADD,
    SUB,
    MUL,
    DIV,
    MOD,
    EQ,
    NE,
    LT,
    LE,
    GT,
    GE
  }

  private final BinaryKind kind;
  private final ExprNode leftExpr;
  private final ExprNode rightExpr;
  
  BinaryExprNode(BinaryKind kind, ExprNode leftExpr, ExprNode rightExpr, Locatable locatable) {
    super(locatable);
    this.kind = kind;
    this.leftExpr = leftExpr;
    this.rightExpr = rightExpr;
  }
  
  public BinaryKind getKind() {
    return kind;
  }
  public ExprNode getLeftExpr() {
    return leftExpr;
  }
  public ExprNode getRightExpr() {
    return rightExpr;
  }
  
  @Override
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data) {
    return visitor.visitBinary(this, data);
  }
}
