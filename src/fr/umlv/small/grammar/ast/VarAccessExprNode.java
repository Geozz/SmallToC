package fr.umlv.small.grammar.ast;

public class VarAccessExprNode extends AbstractLocatable implements ExprNode {
  private final String name;
  
  VarAccessExprNode(String name, Locatable locatable) {
    super(locatable);
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  @Override
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data) {
    return visitor.visitVarAccess(this, data);
  }
}
