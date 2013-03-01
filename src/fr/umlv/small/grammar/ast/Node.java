package fr.umlv.small.grammar.ast;

public interface Node extends Locatable {
  @Override
  public int getLineNumber();
  
  @Override
  public int getColumnNumber();
}
