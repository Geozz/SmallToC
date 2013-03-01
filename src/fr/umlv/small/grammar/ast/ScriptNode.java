package fr.umlv.small.grammar.ast;

import java.util.List;

public class ScriptNode extends AbstractLocatable implements Node {
  private final List<ClassDefNode> classes;
  private final List<FunctionDefNode> functions;

  public ScriptNode(List<ClassDefNode> classes, List<FunctionDefNode> functions) {
    super(1, 1);
    this.classes = classes;
    this.functions = functions;
  }
  
  public List<ClassDefNode> getClasses() {
    return classes;
  }
  public List<FunctionDefNode> getFunctions() {
    return functions;
  }
}
