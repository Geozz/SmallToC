package fr.umlv.small.interpreter;

public class InterpreterException extends RuntimeException {
  private static final long serialVersionUID = 3923615581412369791L;

  public InterpreterException(String message) {
    super(message);
  }
  
  public InterpreterException(String message, Throwable cause) {
    super(message, cause);
  }
}