package fr.umlv.small.grammar.ast;

public interface ExprNode extends Node {
  public <R, D> R accept(ExprNodeVisitor<? super D, ? extends R> visitor, D data); 
}
