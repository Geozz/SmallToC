import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import fr.umlv.small.grammar.ast.ASTFactory;
import fr.umlv.small.grammar.ast.ScriptNode;
import fr.umlv.small.interpreter.full.SmallToC;

public class SmallToCMain {
  private static Reader reader(String[] args) throws IOException {
    if (args.length == 0) {
      return new InputStreamReader(System.in);
    }
    return Files.newBufferedReader(Paths.get(args[0]), Charset.defaultCharset());
  }
  
  public static void main(String[] args) throws IOException {
    ScriptNode script;
    try(Reader reader = reader(args)) {
      script = ASTFactory.parseScript(reader);
    }
    
    SmallToC stc = SmallToC.createSmallToC(script, System.err);
    stc.writeHeaders();
    stc.start();
    
    /*
    PrettyPrinter printer = new PrettyPrinter();
    printer = printer.append(script);
    StringBuilder sb = printer.toBuilder();
    System.out.println(sb);
    */
    /*
    FullInterpreter interpreter = FullInterpreter.createInterpreter(script);
    try {
      interpreter.interpret();
    } catch(InterpreterException e) {
      System.err.println(e.getMessage());
    }
    */
  }
}
