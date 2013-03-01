package fr.umlv.small.grammar.ast;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.umlv.small.grammar.tools.Analyzers;
import fr.umlv.small.grammar.tools.GrammarEvaluator;
import fr.umlv.small.grammar.tools.TerminalEvaluator;
import fr.umlv.tatoo.runtime.buffer.impl.LocationTracker;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;

import static fr.umlv.small.grammar.ast.BinaryExprNode.BinaryKind.*;
import static fr.umlv.small.grammar.ast.ConstExprNode.ConstKind.*;
import static fr.umlv.small.grammar.ast.UnaryExprNode.UnaryKind.*;

public class ASTFactory {

  static final class ASTTerminalEvaluator implements TerminalEvaluator<CharSequence> {
    private final LocationTracker tracker;

    ASTTerminalEvaluator(LocationTracker tracker) {
      this.tracker = tracker;
    }

    @Override
    public void comment(CharSequence data) {
      // do nothing
    }

    @Override
    public Token<String> text(CharSequence data) {
      return createToken(data.subSequence(1, data.length() -1).toString());
    }

    @Override
    public Token<Integer> integer(CharSequence data) {
      return createToken(Integer.parseInt(data.toString()));
    }

    @Override
    public Token<Boolean> bool(CharSequence data) {
      return createToken(Boolean.parseBoolean(data.toString()));
    }

    @Override
    public Token<String> id(CharSequence data) {
      return createToken(data.toString());
    }
    
    private <V> Token<V> createToken(V value) {
      return new Token<>(value, tracker.getLineNumber(), 1 + tracker.getColumnNumber());
    }
  }

  static final class ASTGrammarEvaluator implements GrammarEvaluator {
    private ScriptNode script;

    public ScriptNode getScript() {
      return script;
    }

    @Override
    public void acceptScript(ScriptNode script) {
      this.script = script;
    }

    // --- helper methods
    private static List<String> asStrings(List<Token<String>> ids) {
      switch(ids.size()) {
      case 0:
        return Collections.emptyList();
      case 1:
        return Collections.singletonList(ids.get(0).getValue());
      default:
        ArrayList<String> typeNames = new ArrayList<>();
        for(Token<String> id: ids) {
          typeNames.add(id.getValue());
        }
        return typeNames;
      }
    }

    @Override
    public ScriptNode script(List<MemberDefNode> member_star) {
      ArrayList<ClassDefNode> classes = new ArrayList<>();
      ArrayList<FunctionDefNode> functions = new ArrayList<>();
      for(MemberDefNode member: member_star) {
        if (member instanceof FunctionDefNode) {
          functions.add((FunctionDefNode)member);
        } else {
          classes.add((ClassDefNode)member);
        }
      }
      return new ScriptNode(classes, functions);
    }

    @Override
    public MemberDefNode class_member(ClassDefNode _class) {
      return _class;
    }

    @Override
    public MemberDefNode function_member(FunctionDefNode function) {
      return function;
    }

    @Override
    public ClassDefNode _class(Token<String> id, List<FieldDefNode> field_star) {
      return new ClassDefNode(id.getValue(), field_star, id);
    }
    
    @Override
    public FieldDefNode field(Token<String> id) {
      return new FieldDefNode(id.getValue(), id);
    }
    
    @Override
    public FunctionDefNode function(Token<String> id, List<Token<String>> id_star, List<ExprNode> expr_star) {
      return new FunctionDefNode(id.getValue(), asStrings(id_star), expr_star, id);
    }

    @Override
    public ExprNode instr(ExprNode expr) {
      return expr;
    }
    
    @Override
    public ExprNode expr_bool(Token<Boolean> bool) {
      return new ConstExprNode(BOOL, bool.getValue(), bool);
    }

    @Override
    public ExprNode expr_integer(Token<Integer> integer) {
      return new ConstExprNode(INTEGER, integer.getValue(), integer);
    }

    @Override
    public ExprNode expr_text(Token<String> text) {
      return new ConstExprNode(TEXT, text.getValue(), text);
    }

    // ----- unary expression
    @Override
    public ExprNode expr_unary_plus(ExprNode expr) {
      return new UnaryExprNode(PLUS, expr, expr);
    }

    @Override
    public ExprNode expr_unary_minus(ExprNode expr) {
      return new UnaryExprNode(MINUS, expr, expr);
    }

    @Override
    public ExprNode expr_unary_not(ExprNode expr) {
      return new UnaryExprNode(NOT, expr, expr);
    }

    // ----- binary expression
    @Override
    public ExprNode expr_binary_add(ExprNode expr, ExprNode expr2) {
      return new BinaryExprNode(ADD, expr, expr2, expr);
    }

    @Override
    public ExprNode expr_binary_sub(ExprNode expr, ExprNode expr2) {
      return new BinaryExprNode(SUB, expr, expr2, expr);
    }

    @Override
    public ExprNode expr_binary_mul(ExprNode expr, ExprNode expr2) {
      return new BinaryExprNode(MUL, expr, expr2, expr);
    }

    @Override
    public ExprNode expr_binary_div(ExprNode expr, ExprNode expr2) {
      return new BinaryExprNode(DIV, expr, expr2, expr);
    }

    @Override
    public ExprNode expr_binary_mod(ExprNode expr, ExprNode expr2) {
      return new BinaryExprNode(MOD, expr, expr2, expr);
    }

    @Override
    public ExprNode expr_binary_eq(ExprNode expr, ExprNode expr2) {
      return new BinaryExprNode(EQ, expr, expr2, expr);
    }

    @Override
    public ExprNode expr_binary_ne(ExprNode expr, ExprNode expr2) {
      return new BinaryExprNode(NE, expr, expr2, expr);
    }

    @Override
    public ExprNode expr_binary_lt(ExprNode expr, ExprNode expr2) {
      return new BinaryExprNode(LT, expr, expr2, expr);
    }

    @Override
    public ExprNode expr_binary_le(ExprNode expr, ExprNode expr2) {
      return new BinaryExprNode(LE, expr, expr2, expr);
    }

    @Override
    public ExprNode expr_binary_gt(ExprNode expr, ExprNode expr2) {
      return new BinaryExprNode(GT, expr, expr2, expr);
    }

    @Override
    public ExprNode expr_binary_ge(ExprNode expr, ExprNode expr2) {
      return new BinaryExprNode(GE, expr, expr2, expr);
    }

    @Override
    public ExprNode expr_parens(ExprNode expr) {
      return expr;
    }

    @Override
    public ExprNode expr_if(ExprNode expr, List<ExprNode> expr_plus, List<ExprNode> _else) {
      return new IfExprNode(expr, expr_plus, _else);
    }
    @Override
    public ExprNode expr_if_expr(ExprNode expr, ExprNode expr2, List<ExprNode> _else) {
      return new IfExprNode(expr, Collections.singletonList(expr2), _else);
    }
    @Override
    public List<ExprNode> else_instrs(List<ExprNode> instr_plus) {
      return instr_plus;
    }
    @Override
    public List<ExprNode> else_expr(ExprNode expr) {
      return Collections.singletonList(expr);
    }
    @Override
    public List<ExprNode> else_empty() {
      return Collections.emptyList();
    }

    @Override
    public ExprNode expr_is(ExprNode expr, Token<String> id) {
      return new IsExprNode(expr, id.getValue());
    }

    @Override
    public ExprNode expr_var_access(Token<String> id) {
      return new VarAccessExprNode(id.getValue(), id);
    }

    @Override
    public ExprNode expr_var_assignment(Token<String> id, ExprNode expr) {
      return new VarAssignmentExprNode(id.getValue(), expr, id);
    }

    @Override
    public ExprNode expr_field_access(ExprNode expr, Token<String> id) {
      return new FieldAccessExprNode(expr, id.getValue(), expr);
    }

    @Override
    public ExprNode expr_function_call(Token<String> id, List<ExprNode> expr_star) {
      return new FunctionCallExprNode(id.getValue(), expr_star, id);
    }

    @Override
    public ExprNode expr_method_call(ExprNode expr, Token<String> id, List<ExprNode> expr_star) {
      return new MethodCallExprNode(expr, id.getValue(), expr_star, expr);
    }

    @Override
    public ExprNode expr_method_assignment(ExprNode expr, Token<String> id, ExprNode expr2) {
      return new MethodAssignmentExprNode(expr, id.getValue(), expr2, expr);
    }

    @Override
    public ExprNode expr_allocation(Token<String> id, List<FieldInitNode> init_star) {
      return new InstanceAllocationExprNode(id.getValue(), init_star, id);
    }

    @Override
    public FieldInitNode init(Token<String> id, ExprNode expr) {
      return new FieldInitNode(id.getValue(), expr, id);
    }
  }

  public static ScriptNode parseScript(Reader reader) {
    LocationTracker tracker = new LocationTracker();
    ReaderWrapper buffer = new ReaderWrapper(reader, tracker);
    ASTTerminalEvaluator terminalEvaluator = new ASTTerminalEvaluator(tracker);
    ASTGrammarEvaluator grammarEvaluator = new ASTGrammarEvaluator();
    Analyzers.run(buffer, terminalEvaluator, grammarEvaluator, null, null);
    return grammarEvaluator.getScript();
  }
}
