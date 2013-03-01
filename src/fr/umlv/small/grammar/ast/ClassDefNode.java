package fr.umlv.small.grammar.ast;

import java.util.List;

public class ClassDefNode extends AbstractLocatable implements MemberDefNode {
  private final List<FieldDefNode> fields;
  private final String name;

  ClassDefNode(String name, List<FieldDefNode> fields, Locatable locatable) {
    super(locatable);
    this.name = name;
    this.fields = fields;
  }

  public String getName() {
    return name;
  }
  public List<FieldDefNode> getFields() {
    return fields;
  }
}
