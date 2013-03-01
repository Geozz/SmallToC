package fr.umlv.small.grammar.ast;

import java.util.List;

public class InstanceAllocationExprNode extends AbstractLocatable implements ExprNode {
  private final String typeName;
  private final List<FieldInitNode> fieldInits;

  InstanceAllocationExprNode(String typeName, List<FieldInitNode> fieldInits, Locatable locatable) {
    super(locatable);
    this.typeName = typeName;
    this.fieldInits = fieldInits;
  }

  public String getTypeName() {
    return typeName;
  }
  public List<FieldInitNode> getFieldInits() {
    return fieldInits;
  }
  
  @Override
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data) {
    return visitor.visitInstanceAllocation(this, data);
  }
}
