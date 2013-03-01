package fr.umlv.small.grammar.ast;

abstract class AbstractLocatable implements Locatable {
  final int lineNumber;
  final int columnNumber;

  AbstractLocatable(int lineNumber, int columnNumber) {
    this.lineNumber = lineNumber;
    this.columnNumber = columnNumber;
  }
  
  AbstractLocatable(Locatable locatable) {
    this(locatable.getLineNumber(), locatable.getColumnNumber());
  }
  
  @Override
  public int getLineNumber() {
    return lineNumber;
  }

  @Override
  public int getColumnNumber() {
    return columnNumber;
  }
}
