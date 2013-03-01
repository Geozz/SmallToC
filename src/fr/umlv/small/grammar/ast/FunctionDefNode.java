package fr.umlv.small.grammar.ast;

import java.util.List;

public class FunctionDefNode extends AbstractLocatable implements MemberDefNode {
  private String name;
  private List<String> parameters;
  private List<ExprNode> exprs;

  FunctionDefNode(String name, List<String> parameters, List<ExprNode> exprs, Locatable locatable) {
    super(locatable);
    this.name = name;
    this.parameters = parameters;
    this.exprs = exprs;
  }

  public String getName() {
    return name;
  }
  public List<String> getParameters() {
    return parameters;
  }
  public List<ExprNode> getExprs() {
    return exprs;
  }
}
