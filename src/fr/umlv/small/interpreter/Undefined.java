package fr.umlv.small.interpreter;

public class Undefined {
  private Undefined() {
    // enforce singleton
  }

  @Override
  public String toString() {
    return "undefined";
  }
  
  public static final Undefined UNDEFINED = new Undefined();
}