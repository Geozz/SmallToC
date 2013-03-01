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
  
import fr.umlv.small.grammar.lexer.RuleEnum;
import fr.umlv.small.grammar.parser.TerminalEnum;
import fr.umlv.small.grammar.parser.NonTerminalEnum;
import fr.umlv.small.grammar.parser.ProductionEnum;
import fr.umlv.small.grammar.tools.TerminalEvaluator;
import fr.umlv.small.grammar.tools.GrammarEvaluator;

import fr.umlv.tatoo.runtime.buffer.LexerBuffer;
import fr.umlv.tatoo.runtime.tools.AnalyzerListener;
import fr.umlv.tatoo.runtime.tools.DataViewer;
import fr.umlv.tatoo.runtime.tools.SemanticStack;

/**  This class is called by the parser when
 *  <ol>
 *    <li>a terminal is shifted</li>
 *    <li>a non terminal is reduced</li>
 *    <li>a non terminal is accepted</li>
 *   </ol>
 *   In that case, depending on the information of the .xtls, terminal and non-terminal
 *   values are pushed/pop from a semantic stack.
 *   
 *   Furthermore, in case of error recovery, values of the stack can be pop out
 *   depending if the last recognized element is a terminal or a non-terminal.
 * 
 *  This class is generated - please do not edit it 
 */
public class AnalyzerProcessor<B extends LexerBuffer,D>
  implements AnalyzerListener<RuleEnum,B,TerminalEnum,NonTerminalEnum,ProductionEnum> {
          
  private final GrammarEvaluator grammarEvaluator;
  private final TerminalEvaluator<? super D> terminalEvaluator;
  private final DataViewer<? super B,? extends D> dataViewer;
  private final SemanticStack stack;
  
  protected AnalyzerProcessor(TerminalEvaluator<? super D> terminalEvaluator, GrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    this.terminalEvaluator=terminalEvaluator;
    this.grammarEvaluator=grammarEvaluator;
    this.dataViewer=dataViewer;
    this.stack=stack;
  }
  
  /** Creates a tools listener that redirect accept/shift/reduce and comment to the terminal Evaluator
      and the grammar evaluator..
      This constructor allows to share the same stack between more
      than one parser processor.
      @param terminalEvaluator the terminal evaluator.
      @param grammarEvaluator the grammar evaluator.
      @param stack the stack used by the processor
   */
  public static <B extends LexerBuffer,D> AnalyzerProcessor<B,D>
    createAnalyzerProcessor(TerminalEvaluator<? super D> terminalEvaluator, GrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    
    return new AnalyzerProcessor<B,D>(terminalEvaluator,grammarEvaluator,dataViewer,stack);
  }
  
  public void comment(RuleEnum rule, B buffer) {
    D data;
    switch(rule) {           case comment:
            data=dataViewer.view(buffer);
            terminalEvaluator.comment(data);
            return;
              default:
    }
    throw new AssertionError("unknown rule "+rule);
  }
 
   public void shift(TerminalEnum terminal, RuleEnum rule, B buffer) {
     D data;
     switch(terminal) {      case plus: {
                       return;
           }
                 case minus: {
                       return;
           }
                 case star: {
                       return;
           }
                 case slash: {
                       return;
           }
                 case mod: {
                       return;
           }
                 case assign: {
                       return;
           }
                 case eq: {
                       return;
           }
                 case ne: {
                       return;
           }
                 case lt: {
                       return;
           }
                 case le: {
                       return;
           }
                 case gt: {
                       return;
           }
                 case ge: {
                       return;
           }
                 case dot: {
                       return;
           }
                 case bang: {
                       return;
           }
                 case or: {
                       return;
           }
                 case _if: {
                       return;
           }
                 case is: {
                       return;
           }
                 case colon: {
                       return;
           }
                 case comma: {
                       return;
           }
                 case eol: {
                       return;
           }
                 case lpar: {
                       return;
           }
                 case rpar: {
                       return;
           }
                 case lcurl: {
                       return;
           }
                 case rcurl: {
                       return;
           }
                 case classdef: {
                       return;
           }
                 case def: {
                       return;
           }
                 case bool: {
         data=dataViewer.view(buffer);
                                  fr.umlv.small.grammar.ast.Token<Boolean> bool=terminalEvaluator.bool(data);
                                      stack.push_Object(bool);
                                 return;
           }
                 case id: {
         data=dataViewer.view(buffer);
                                  fr.umlv.small.grammar.ast.Token<String> id=terminalEvaluator.id(data);
                                      stack.push_Object(id);
                                 return;
           }
                 case text: {
         data=dataViewer.view(buffer);
                                  fr.umlv.small.grammar.ast.Token<String> text=terminalEvaluator.text(data);
                                      stack.push_Object(text);
                                 return;
           }
                 case integer: {
         data=dataViewer.view(buffer);
                                  fr.umlv.small.grammar.ast.Token<Integer> integer=terminalEvaluator.integer(data);
                                      stack.push_Object(integer);
                                 return;
           }
                 case __eof__: {
                       return;
           }
                 }
     throw new AssertionError("unknown terminal "+terminal);
   }
    
    
    @SuppressWarnings("unchecked")
    public void reduce(ProductionEnum production) {
      switch(production) {           case member_star_0_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case member_star_0_rec: { // STAR_RECURSIVE_LEFT
                            
                    MemberDefNode member=(MemberDefNode)stack.pop_Object();
                    List<MemberDefNode> member_star_0=(List<MemberDefNode>)stack.pop_Object();
                     member_star_0.add(member);
                     stack.push_Object(member_star_0);
                       
          }
          return;
                    case script: { // not synthetic
                                 List<MemberDefNode> member_star_0=(List<MemberDefNode>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.script(member_star_0));
                      
          }
          return;
                    case class_member: { // not synthetic
                                 ClassDefNode _class=(ClassDefNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.class_member(_class));
                      
          }
          return;
                    case function_member: { // not synthetic
                                 FunctionDefNode function=(FunctionDefNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.function_member(function));
                      
          }
          return;
                    case field_star_1_element: { // STAR_SINGLETON
                             java.util.ArrayList<FieldDefNode> list=
                     new java.util.ArrayList<FieldDefNode>();
                   list.add((FieldDefNode)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case field_star_1_rec: { // STAR_RECURSIVE_LEFT
                            
                    FieldDefNode field=(FieldDefNode)stack.pop_Object();
                    List<FieldDefNode> field_star_1_sub=(List<FieldDefNode>)stack.pop_Object();
                     field_star_1_sub.add(field);
                     stack.push_Object(field_star_1_sub);
                       
          }
          return;
                    case field_star_1_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case field_star_1_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case _class: { // not synthetic
                                 List<FieldDefNode> field_star_1=(List<FieldDefNode>)stack.pop_Object();
                                          Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator._class(id,field_star_1));
                      
          }
          return;
                    case field: { // not synthetic
                                 Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.field(id));
                      
          }
          return;
                    case id_star_2_element: { // STAR_SINGLETON
                             java.util.ArrayList<Token<String>> list=
                     new java.util.ArrayList<Token<String>>();
                   list.add((Token<String>)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case id_star_2_rec: { // STAR_RECURSIVE_LEFT
                            
                    Token<String> id=(Token<String>)stack.pop_Object();
                    List<Token<String>> id_star_2_sub=(List<Token<String>>)stack.pop_Object();
                     id_star_2_sub.add(id);
                     stack.push_Object(id_star_2_sub);
                       
          }
          return;
                    case id_star_2_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case id_star_2_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case instr_star_3_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case instr_star_3_rec: { // STAR_RECURSIVE_LEFT
                            
                    ExprNode instr=(ExprNode)stack.pop_Object();
                    List<ExprNode> instr_star_3=(List<ExprNode>)stack.pop_Object();
                     instr_star_3.add(instr);
                     stack.push_Object(instr_star_3);
                       
          }
          return;
                    case function: { // not synthetic
                                 List<ExprNode> instr_star_3=(List<ExprNode>)stack.pop_Object();
                                          List<Token<String>> id_star_2=(List<Token<String>>)stack.pop_Object();
                                          Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.function(id,id_star_2,instr_star_3));
                      
          }
          return;
                    case instr: { // not synthetic
                                 ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr(expr));
                      
          }
          return;
                    case init: { // not synthetic
                                 ExprNode expr=(ExprNode)stack.pop_Object();
                                          Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.init(id,expr));
                      
          }
          return;
                    case instr_plus_4_element: { // STAR_SINGLETON
                             java.util.ArrayList<ExprNode> list=
                     new java.util.ArrayList<ExprNode>();
                   list.add((ExprNode)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case instr_plus_4_rec: { // STAR_RECURSIVE_LEFT
                            
                    ExprNode instr=(ExprNode)stack.pop_Object();
                    List<ExprNode> instr_plus_4=(List<ExprNode>)stack.pop_Object();
                     instr_plus_4.add(instr);
                     stack.push_Object(instr_plus_4);
                       
          }
          return;
                    case else_instrs: { // not synthetic
                                 List<ExprNode> instr_plus_4=(List<ExprNode>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.else_instrs(instr_plus_4));
                      
          }
          return;
                    case else_expr: { // not synthetic
                                 ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.else_expr(expr));
                      
          }
          return;
                    case else_empty: { // not synthetic
                                       stack.push_Object(grammarEvaluator.else_empty());
                      
          }
          return;
                    case expr_integer: { // not synthetic
                                 Token<Integer> integer=(Token<Integer>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_integer(integer));
                      
          }
          return;
                    case expr_bool: { // not synthetic
                                 Token<Boolean> bool=(Token<Boolean>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_bool(bool));
                      
          }
          return;
                    case expr_text: { // not synthetic
                                 Token<String> text=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_text(text));
                      
          }
          return;
                    case expr_var_access: { // not synthetic
                                 Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_var_access(id));
                      
          }
          return;
                    case expr_parens: { // not synthetic
                                 ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_parens(expr));
                      
          }
          return;
                    case expr_var_assignment: { // not synthetic
                                 ExprNode expr=(ExprNode)stack.pop_Object();
                                          Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_var_assignment(id,expr));
                      
          }
          return;
                    case expr_field_access: { // not synthetic
                                 Token<String> id=(Token<String>)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_field_access(expr,id));
                      
          }
          return;
                    case expr_star_5_element: { // STAR_SINGLETON
                             java.util.ArrayList<ExprNode> list=
                     new java.util.ArrayList<ExprNode>();
                   list.add((ExprNode)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_star_5_rec: { // STAR_RECURSIVE_LEFT
                            
                    ExprNode expr=(ExprNode)stack.pop_Object();
                    List<ExprNode> expr_star_5_sub=(List<ExprNode>)stack.pop_Object();
                     expr_star_5_sub.add(expr);
                     stack.push_Object(expr_star_5_sub);
                       
          }
          return;
                    case expr_star_5_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case expr_star_5_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case expr_function_call: { // not synthetic
                                 List<ExprNode> expr_star_5=(List<ExprNode>)stack.pop_Object();
                                          Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_function_call(id,expr_star_5));
                      
          }
          return;
                    case expr_star_6_element: { // STAR_SINGLETON
                             java.util.ArrayList<ExprNode> list=
                     new java.util.ArrayList<ExprNode>();
                   list.add((ExprNode)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_star_6_rec: { // STAR_RECURSIVE_LEFT
                            
                    ExprNode expr=(ExprNode)stack.pop_Object();
                    List<ExprNode> expr_star_6_sub=(List<ExprNode>)stack.pop_Object();
                     expr_star_6_sub.add(expr);
                     stack.push_Object(expr_star_6_sub);
                       
          }
          return;
                    case expr_star_6_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case expr_star_6_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case expr_method_call: { // not synthetic
                                 List<ExprNode> expr_star_6=(List<ExprNode>)stack.pop_Object();
                                          Token<String> id=(Token<String>)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_method_call(expr,id,expr_star_6));
                      
          }
          return;
                    case expr_method_assignment: { // not synthetic
                                 ExprNode expr2=(ExprNode)stack.pop_Object();
                                          Token<String> id=(Token<String>)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_method_assignment(expr,id,expr2));
                      
          }
          return;
                    case init_star_7_element: { // STAR_SINGLETON
                             java.util.ArrayList<FieldInitNode> list=
                     new java.util.ArrayList<FieldInitNode>();
                   list.add((FieldInitNode)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case init_star_7_rec: { // STAR_RECURSIVE_LEFT
                            
                    FieldInitNode init=(FieldInitNode)stack.pop_Object();
                    List<FieldInitNode> init_star_7_sub=(List<FieldInitNode>)stack.pop_Object();
                     init_star_7_sub.add(init);
                     stack.push_Object(init_star_7_sub);
                       
          }
          return;
                    case init_star_7_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case init_star_7_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case expr_allocation: { // not synthetic
                                 List<FieldInitNode> init_star_7=(List<FieldInitNode>)stack.pop_Object();
                                          Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_allocation(id,init_star_7));
                      
          }
          return;
                    case instr_plus_8_element: { // STAR_SINGLETON
                             java.util.ArrayList<ExprNode> list=
                     new java.util.ArrayList<ExprNode>();
                   list.add((ExprNode)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case instr_plus_8_rec: { // STAR_RECURSIVE_LEFT
                            
                    ExprNode instr=(ExprNode)stack.pop_Object();
                    List<ExprNode> instr_plus_8=(List<ExprNode>)stack.pop_Object();
                     instr_plus_8.add(instr);
                     stack.push_Object(instr_plus_8);
                       
          }
          return;
                    case expr_if: { // not synthetic
                                 List<ExprNode> _else=(List<ExprNode>)stack.pop_Object();
                                          List<ExprNode> instr_plus_8=(List<ExprNode>)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_if(expr,instr_plus_8,_else));
                      
          }
          return;
                    case expr_if_expr: { // not synthetic
                                 List<ExprNode> _else=(List<ExprNode>)stack.pop_Object();
                                          ExprNode expr2=(ExprNode)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_if_expr(expr,expr2,_else));
                      
          }
          return;
                    case expr_unary_minus: { // not synthetic
                                 ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_unary_minus(expr));
                      
          }
          return;
                    case expr_unary_plus: { // not synthetic
                                 ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_unary_plus(expr));
                      
          }
          return;
                    case expr_unary_not: { // not synthetic
                                 ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_unary_not(expr));
                      
          }
          return;
                    case expr_is: { // not synthetic
                                 Token<String> id=(Token<String>)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_is(expr,id));
                      
          }
          return;
                    case expr_binary_add: { // not synthetic
                                 ExprNode expr2=(ExprNode)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_add(expr,expr2));
                      
          }
          return;
                    case expr_binary_sub: { // not synthetic
                                 ExprNode expr2=(ExprNode)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_sub(expr,expr2));
                      
          }
          return;
                    case expr_binary_mul: { // not synthetic
                                 ExprNode expr2=(ExprNode)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_mul(expr,expr2));
                      
          }
          return;
                    case expr_binary_div: { // not synthetic
                                 ExprNode expr2=(ExprNode)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_div(expr,expr2));
                      
          }
          return;
                    case expr_binary_mod: { // not synthetic
                                 ExprNode expr2=(ExprNode)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_mod(expr,expr2));
                      
          }
          return;
                    case expr_binary_eq: { // not synthetic
                                 ExprNode expr2=(ExprNode)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_eq(expr,expr2));
                      
          }
          return;
                    case expr_binary_ne: { // not synthetic
                                 ExprNode expr2=(ExprNode)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_ne(expr,expr2));
                      
          }
          return;
                    case expr_binary_lt: { // not synthetic
                                 ExprNode expr2=(ExprNode)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_lt(expr,expr2));
                      
          }
          return;
                    case expr_binary_le: { // not synthetic
                                 ExprNode expr2=(ExprNode)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_le(expr,expr2));
                      
          }
          return;
                    case expr_binary_gt: { // not synthetic
                                 ExprNode expr2=(ExprNode)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_gt(expr,expr2));
                      
          }
          return;
                    case expr_binary_ge: { // not synthetic
                                 ExprNode expr2=(ExprNode)stack.pop_Object();
                                          ExprNode expr=(ExprNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_ge(expr,expr2));
                      
          }
          return;
                    default:
             throw new AssertionError("unknown production "+production);
       }
    }

     public void accept(NonTerminalEnum nonterminal) {
       switch(nonterminal) {            case script:
             grammarEvaluator.acceptScript((ScriptNode)stack.pop_Object());
             return;
                     default:
       }
        throw new AssertionError("unknown start nonterminal "+nonterminal);
     }

      public void popTerminalOnError(TerminalEnum terminal) {
        switch(terminal) {             case plus:
              
              return;
                         case minus:
              
              return;
                         case star:
              
              return;
                         case slash:
              
              return;
                         case mod:
              
              return;
                         case assign:
              
              return;
                         case eq:
              
              return;
                         case ne:
              
              return;
                         case lt:
              
              return;
                         case le:
              
              return;
                         case gt:
              
              return;
                         case ge:
              
              return;
                         case dot:
              
              return;
                         case bang:
              
              return;
                         case or:
              
              return;
                         case _if:
              
              return;
                         case is:
              
              return;
                         case colon:
              
              return;
                         case comma:
              
              return;
                         case eol:
              
              return;
                         case lpar:
              
              return;
                         case rpar:
              
              return;
                         case lcurl:
              
              return;
                         case rcurl:
              
              return;
                         case classdef:
              
              return;
                         case def:
              
              return;
                         case bool:
              stack.pop_Object();
              return;
                         case id:
              stack.pop_Object();
              return;
                         case text:
              stack.pop_Object();
              return;
                         case integer:
              stack.pop_Object();
              return;
                         case __eof__:
              
              return;
                     }
        throw new AssertionError("unknown terminal "+terminal);
      }
 
      public void popNonTerminalOnError(NonTerminalEnum nonTerminal) {
        switch(nonTerminal) {             case script:
              stack.pop_Object();
              return;
                         case member:
              stack.pop_Object();
              return;
                         case _class:
              stack.pop_Object();
              return;
                         case field:
              stack.pop_Object();
              return;
                         case function:
              stack.pop_Object();
              return;
                         case instr:
              stack.pop_Object();
              return;
                         case init:
              stack.pop_Object();
              return;
                         case _else:
              stack.pop_Object();
              return;
                         case expr:
              stack.pop_Object();
              return;
                         case member_star_0:
              stack.pop_Object();
              return;
                         case field_star_1:
              stack.pop_Object();
              return;
                         case field_star_1_sub:
              stack.pop_Object();
              return;
                         case id_star_2:
              stack.pop_Object();
              return;
                         case id_star_2_sub:
              stack.pop_Object();
              return;
                         case instr_star_3:
              stack.pop_Object();
              return;
                         case instr_plus_4:
              stack.pop_Object();
              return;
                         case expr_star_5:
              stack.pop_Object();
              return;
                         case expr_star_5_sub:
              stack.pop_Object();
              return;
                         case expr_star_6:
              stack.pop_Object();
              return;
                         case expr_star_6_sub:
              stack.pop_Object();
              return;
                         case init_star_7:
              stack.pop_Object();
              return;
                         case init_star_7_sub:
              stack.pop_Object();
              return;
                         case instr_plus_8:
              stack.pop_Object();
              return;
                     }
        throw new AssertionError("unknown nonterminal "+nonTerminal);
      }
}