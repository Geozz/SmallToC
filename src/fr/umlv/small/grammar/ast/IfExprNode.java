package fr.umlv.small.grammar.ast;

import java.util.List;

public class IfExprNode extends AbstractLocatable implements ExprNode {
  private final ExprNode conditionExpr;
  private final List<ExprNode> thenExprs;
  private final List<ExprNode> elseExprs;

  IfExprNode(ExprNode conditionExpr, List<ExprNode> thenExprs, List<ExprNode> elseExprs) {
    super(conditionExpr);
    this.conditionExpr = conditionExpr;
    this.thenExprs = thenExprs;
    this.elseExprs = elseExprs;
  }

  public ExprNode getConditionExpr() {
    return conditionExpr;
  }
  public List<ExprNode> getThenExprs() {
    return thenExprs;
  }
  public List<ExprNode> getElseExprs() {
    return elseExprs;
  }
  
  @Override
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data) {
    return visitor.visitIf(this, data);
  }
}
