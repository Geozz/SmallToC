package fr.umlv.small.grammar.ast;

import java.util.List;

public class FunctionCallExprNode extends AbstractLocatable implements ExprNode {
  private final String name;
  private final List<ExprNode> arguments;

  FunctionCallExprNode(String name, List<ExprNode> arguments, Locatable locatable) {
    super(locatable);
    this.name = name;
    this.arguments = arguments;
  }
  
  public String getName() {
    return name;
  }
  public List<ExprNode> getArguments() {
    return arguments;
  }

  @Override
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data) {
    return visitor.visitFunctionCall(this, data);
  }
}
