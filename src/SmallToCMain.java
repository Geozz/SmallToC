import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
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

    String outName = args[0].substring(args[0].lastIndexOf("/")).replace(".small", ".c");
    PrintStream outStream = new PrintStream(new File("out" + outName));

    SmallToC stc = SmallToC.createSmallToC(script, outStream);
    stc.writeHeaders();
    stc.start();
    
    outStream.close();
  }
}
