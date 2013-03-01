package fr.umlv.small.grammar.ast;

import java.util.List;

public class MethodCallExprNode extends AbstractLocatable implements ExprNode {
  private final ExprNode receiver;
  private final String name;
  private final List<ExprNode> arguments;

  MethodCallExprNode(ExprNode receiver, String name, List<ExprNode> arguments, Locatable locatable) {
    super(locatable);
    this.receiver = receiver;
    this.name = name;
    this.arguments = arguments;
  }
  
  public ExprNode getReceiver() {
    return receiver;
  }
  public String getName() {
    return name;
  }
  public List<ExprNode> getArguments() {
    return arguments;
  }

  @Override
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data) {
    return visitor.visitMethodCall(this, data);
  }
}
