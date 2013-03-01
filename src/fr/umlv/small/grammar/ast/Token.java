package fr.umlv.small.grammar.ast;

public class Token<V> extends AbstractLocatable {
  private final V value;

  Token(V value, int lineNumber, int columnNumber) {
    super(lineNumber, columnNumber);
    this.value = value;
  }
  
  public V getValue() {
    return value;
  }
}
