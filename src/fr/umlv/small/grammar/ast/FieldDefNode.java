package fr.umlv.small.grammar.ast;

public class FieldDefNode extends AbstractLocatable implements Node {
  private final String fieldName;

  FieldDefNode(String fieldName, Locatable locatable) {
    super(locatable);
    this.fieldName = fieldName;
  }

  public String getFieldName() {
    return fieldName;
  }
}
