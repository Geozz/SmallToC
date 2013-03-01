package fr.umlv.small.grammar.tools;

import fr.umlv.small.grammar.ast.ClassDefNode;
import fr.umlv.small.grammar.ast.ExprNode;
import fr.umlv.small.grammar.ast.FieldDefNode;
import fr.umlv.small.grammar.ast.FieldInitNode;
import fr.umlv.small.grammar.ast.FunctionDefNode;
import fr.umlv.small.grammar.ast.MemberDefNode;
import fr.umlv.small.grammar.ast.ScriptNode;
import fr.umlv.small.grammar.ast.Token;
import java.util.List;

/** 
 *  This class is generated - please do not edit it 
 */
public interface GrammarEvaluator {
  /** This methods is called after the reduction of the non terminal script
   *  by the grammar production script.
   *  <code>script ::= member_star_0</code>
   */
  public ScriptNode script(List<MemberDefNode> member_star);
  /** This methods is called after the reduction of the non terminal member
   *  by the grammar production class_member.
   *  <code>member ::= _class</code>
   */
  public MemberDefNode class_member(ClassDefNode _class);
  /** This methods is called after the reduction of the non terminal member
   *  by the grammar production function_member.
   *  <code>member ::= function</code>
   */
  public MemberDefNode function_member(FunctionDefNode function);
  /** This methods is called after the reduction of the non terminal _class
   *  by the grammar production _class.
   *  <code>_class ::= classdef id lpar field_star_1 rpar</code>
   */
  public ClassDefNode _class(Token<String> id,List<FieldDefNode> field_star);
  /** This methods is called after the reduction of the non terminal field
   *  by the grammar production field.
   *  <code>field ::= id</code>
   */
  public FieldDefNode field(Token<String> id);
  /** This methods is called after the reduction of the non terminal function
   *  by the grammar production function.
   *  <code>function ::= def id lpar id_star_2 rpar colon instr_star_3</code>
   */
  public FunctionDefNode function(Token<String> id,List<Token<String>> id_star,List<ExprNode> instr_star);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr.
   *  <code>instr ::= expr eol</code>
   */
  public ExprNode instr(ExprNode expr);
  /** This methods is called after the reduction of the non terminal init
   *  by the grammar production init.
   *  <code>init ::= id assign expr</code>
   */
  public FieldInitNode init(Token<String> id,ExprNode expr);
  /** This methods is called after the reduction of the non terminal _else
   *  by the grammar production else_instrs.
   *  <code>_else ::= instr_plus_4</code>
   */
  public List<ExprNode> else_instrs(List<ExprNode> instr_plus);
  /** This methods is called after the reduction of the non terminal _else
   *  by the grammar production else_expr.
   *  <code>_else ::= expr</code>
   */
  public List<ExprNode> else_expr(ExprNode expr);
  /** This methods is called after the reduction of the non terminal _else
   *  by the grammar production else_empty.
   *  <code>_else ::=</code>
   */
  public List<ExprNode> else_empty();
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_integer.
   *  <code>expr ::= integer</code>
   */
  public ExprNode expr_integer(Token<Integer> integer);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_bool.
   *  <code>expr ::= bool</code>
   */
  public ExprNode expr_bool(Token<Boolean> bool);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_text.
   *  <code>expr ::= text</code>
   */
  public ExprNode expr_text(Token<String> text);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_var_access.
   *  <code>expr ::= id</code>
   */
  public ExprNode expr_var_access(Token<String> id);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_parens.
   *  <code>expr ::= lpar expr rpar</code>
   */
  public ExprNode expr_parens(ExprNode expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_var_assignment.
   *  <code>expr ::= id assign expr</code>
   */
  public ExprNode expr_var_assignment(Token<String> id,ExprNode expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_field_access.
   *  <code>expr ::= expr dot id</code>
   */
  public ExprNode expr_field_access(ExprNode expr,Token<String> id);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_function_call.
   *  <code>expr ::= id lpar expr_star_5 rpar</code>
   */
  public ExprNode expr_function_call(Token<String> id,List<ExprNode> expr_star);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_method_call.
   *  <code>expr ::= expr dot id lpar expr_star_6 rpar</code>
   */
  public ExprNode expr_method_call(ExprNode expr,Token<String> id,List<ExprNode> expr_star);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_method_assignment.
   *  <code>expr ::= expr dot id assign expr</code>
   */
  public ExprNode expr_method_assignment(ExprNode expr,Token<String> id,ExprNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_allocation.
   *  <code>expr ::= id lcurl init_star_7 rcurl</code>
   */
  public ExprNode expr_allocation(Token<String> id,List<FieldInitNode> init_star);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_if.
   *  <code>expr ::= expr _if lpar instr_plus_8 or _else rpar</code>
   */
  public ExprNode expr_if(ExprNode expr,List<ExprNode> instr_plus,List<ExprNode> _else);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_if_expr.
   *  <code>expr ::= expr _if lpar expr or _else rpar</code>
   */
  public ExprNode expr_if_expr(ExprNode expr,ExprNode expr2,List<ExprNode> _else);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_minus.
   *  <code>expr ::= minus expr</code>
   */
  public ExprNode expr_unary_minus(ExprNode expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_plus.
   *  <code>expr ::= plus expr</code>
   */
  public ExprNode expr_unary_plus(ExprNode expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_not.
   *  <code>expr ::= bang expr</code>
   */
  public ExprNode expr_unary_not(ExprNode expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_is.
   *  <code>expr ::= expr is id</code>
   */
  public ExprNode expr_is(ExprNode expr,Token<String> id);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_add.
   *  <code>expr ::= expr plus expr</code>
   */
  public ExprNode expr_binary_add(ExprNode expr,ExprNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_sub.
   *  <code>expr ::= expr minus expr</code>
   */
  public ExprNode expr_binary_sub(ExprNode expr,ExprNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_mul.
   *  <code>expr ::= expr star expr</code>
   */
  public ExprNode expr_binary_mul(ExprNode expr,ExprNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_div.
   *  <code>expr ::= expr slash expr</code>
   */
  public ExprNode expr_binary_div(ExprNode expr,ExprNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_mod.
   *  <code>expr ::= expr mod expr</code>
   */
  public ExprNode expr_binary_mod(ExprNode expr,ExprNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_eq.
   *  <code>expr ::= expr eq expr</code>
   */
  public ExprNode expr_binary_eq(ExprNode expr,ExprNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_ne.
   *  <code>expr ::= expr ne expr</code>
   */
  public ExprNode expr_binary_ne(ExprNode expr,ExprNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_lt.
   *  <code>expr ::= expr lt expr</code>
   */
  public ExprNode expr_binary_lt(ExprNode expr,ExprNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_le.
   *  <code>expr ::= expr le expr</code>
   */
  public ExprNode expr_binary_le(ExprNode expr,ExprNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_gt.
   *  <code>expr ::= expr gt expr</code>
   */
  public ExprNode expr_binary_gt(ExprNode expr,ExprNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_ge.
   *  <code>expr ::= expr ge expr</code>
   */
  public ExprNode expr_binary_ge(ExprNode expr,ExprNode expr2);

  public void acceptScript(ScriptNode script);
}
