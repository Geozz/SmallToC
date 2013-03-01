package fr.umlv.small.grammar.ast;

interface Locatable {
  public int getLineNumber();

  public int getColumnNumber();
}