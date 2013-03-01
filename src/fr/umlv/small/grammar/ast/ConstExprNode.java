package fr.umlv.small.grammar.ast;

public class ConstExprNode extends AbstractLocatable implements ExprNode {
  public enum ConstKind {
    INTEGER,
    TEXT,
    BOOL
  }

  private final ConstKind kind;
  private final Object value;
  
  ConstExprNode(ConstKind kind, Object value, Locatable locatable) {
    super(locatable);
    this.kind = kind;
    this.value = value;
  }
  
  public ConstKind getKind() {
    return kind;
  }
  public Object getValue() {
    return value;
  }
  
  @Override
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data) {
    return visitor.visitConst(this, data);
  }
}
