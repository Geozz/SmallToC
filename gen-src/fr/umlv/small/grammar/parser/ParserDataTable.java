package fr.umlv.small.grammar.parser;

import fr.umlv.small.grammar.parser.NonTerminalEnum;
import fr.umlv.small.grammar.parser.ProductionEnum;
import fr.umlv.small.grammar.parser.TerminalEnum;
import fr.umlv.tatoo.runtime.parser.AcceptAction;
import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.BranchAction;
import fr.umlv.tatoo.runtime.parser.ErrorAction;
import fr.umlv.tatoo.runtime.parser.ExitAction;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.parser.ReduceAction;
import fr.umlv.tatoo.runtime.parser.ShiftAction;
import fr.umlv.tatoo.runtime.parser.StateMetadata;
import java.util.EnumMap;

/** 
 *  This class is generated - please do not edit it 
 */
public class ParserDataTable {
  private ParserDataTable() {
   accept = AcceptAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
   exit = ExitAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
    initinstr_plus_4Gotoes();
    initid_star_2_subGotoes();
    initinit_star_7Gotoes();
    init_classGotoes();
    initfunctionGotoes();
    initscriptGotoes();
    initexpr_star_6Gotoes();
    initexprGotoes();
    initmember_star_0Gotoes();
    initinit_star_7_subGotoes();
    initfield_star_1Gotoes();
    initmemberGotoes();
    initinstr_star_3Gotoes();
    initinstr_plus_8Gotoes();
    initexpr_star_5Gotoes();
    initinitGotoes();
    initexpr_star_5_subGotoes();
    initexpr_star_6_subGotoes();
    initinstrGotoes();
    initid_star_2Gotoes();
    initfieldGotoes();
    init_elseGotoes();
    initfield_star_1_subGotoes();
    reduceexpr_binary_le = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_le,3,exprGotoes);
    reduceexpr_binary_ne = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ne,3,exprGotoes);
    reduceexpr_binary_add = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_add,3,exprGotoes);
    reduceelse_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.else_empty,0,_elseGotoes);
    reduceexpr_binary_div = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_div,3,exprGotoes);
    reduceinit = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.init,3,initGotoes);
    reduceexpr_bool = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_bool,1,exprGotoes);
    reduceexpr_method_call = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_method_call,6,exprGotoes);
    reduceexpr_allocation = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_allocation,4,exprGotoes);
    reduceexpr_star_5_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_element,1,expr_star_5_subGotoes);
    reduceexpr_binary_ge = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ge,3,exprGotoes);
    reduceinstr_plus_8_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_plus_8_rec,2,instr_plus_8Gotoes);
    reduceid_star_2_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_element,1,id_star_2_subGotoes);
    reducefunction = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.function,7,functionGotoes);
    reduceid_star_2_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_empty,0,id_star_2Gotoes);
    reduceelse_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.else_expr,1,_elseGotoes);
    reduceexpr_star_5_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_rec,3,expr_star_5_subGotoes);
    reduceexpr_binary_lt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_lt,3,exprGotoes);
    reduceexpr_method_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_method_assignment,5,exprGotoes);
    reduceinit_star_7_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.init_star_7_element,1,init_star_7_subGotoes);
    reduceinstr_star_3_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_star_3_rec,2,instr_star_3Gotoes);
    reduceinit_star_7_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.init_star_7_empty,0,init_star_7Gotoes);
    reducefield_star_1_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.field_star_1_through,1,field_star_1Gotoes);
    reduceelse_instrs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.else_instrs,1,_elseGotoes);
    reduceexpr_integer = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_integer,1,exprGotoes);
    reduceexpr_star_5_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_empty,0,expr_star_5Gotoes);
    reduceexpr_binary_gt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_gt,3,exprGotoes);
    reduceexpr_binary_mod = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mod,3,exprGotoes);
    reduceinstr_plus_4_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_plus_4_element,1,instr_plus_4Gotoes);
    reduceinstr_plus_4_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_plus_4_rec,2,instr_plus_4Gotoes);
    reduceexpr_star_5_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_through,1,expr_star_5Gotoes);
    reducescript = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.script,1,scriptGotoes);
    reduceexpr_binary_mul = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mul,3,exprGotoes);
    reduceexpr_var_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_assignment,3,exprGotoes);
    reduceexpr_field_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_field_access,3,exprGotoes);
    reduceinstr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr,2,instrGotoes);
    reduceexpr_binary_sub = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_sub,3,exprGotoes);
    reduceexpr_if = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if,7,exprGotoes);
    reduce_class = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum._class,5,_classGotoes);
    reduceexpr_unary_not = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_not,2,exprGotoes);
    reduceexpr_is = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_is,3,exprGotoes);
    reduceinit_star_7_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.init_star_7_rec,3,init_star_7_subGotoes);
    reducefunction_member = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.function_member,1,memberGotoes);
    reduceid_star_2_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_rec,3,id_star_2_subGotoes);
    reducemember_star_0_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.member_star_0_rec,2,member_star_0Gotoes);
    reducefield_star_1_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.field_star_1_empty,0,field_star_1Gotoes);
    reduceexpr_if_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if_expr,7,exprGotoes);
    reduceexpr_unary_minus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_minus,2,exprGotoes);
    reducefield_star_1_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.field_star_1_rec,3,field_star_1_subGotoes);
    reduceexpr_function_call = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_function_call,4,exprGotoes);
    reduceexpr_text = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_text,1,exprGotoes);
    reduceinstr_plus_8_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_plus_8_element,1,instr_plus_8Gotoes);
    reduceclass_member = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.class_member,1,memberGotoes);
    reduceinstr_star_3_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_star_3_empty,0,instr_star_3Gotoes);
    reduceexpr_star_6_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_6_element,1,expr_star_6_subGotoes);
    reduceexpr_star_6_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_6_empty,0,expr_star_6Gotoes);
    reducefield_star_1_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.field_star_1_element,1,field_star_1_subGotoes);
    reduceinit_star_7_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.init_star_7_through,1,init_star_7Gotoes);
    reduceexpr_parens = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_parens,3,exprGotoes);
    reduceexpr_var_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_access,1,exprGotoes);
    reducefield = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.field,1,fieldGotoes);
    reduceexpr_binary_eq = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_eq,3,exprGotoes);
    reduceexpr_star_6_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_6_rec,3,expr_star_6_subGotoes);
    reduceid_star_2_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_through,1,id_star_2Gotoes);
    reduceexpr_star_6_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_6_through,1,expr_star_6Gotoes);
    reduceexpr_unary_plus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_plus,2,exprGotoes);
    reducemember_star_0_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.member_star_0_empty,0,member_star_0Gotoes);
    shift13 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(13);
    shift16 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(16);
    shift39 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(39);
    shift69 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(69);
    shift26 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(26);
    shift43 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(43);
    shift105 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(105);
    shift45 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(45);
    shift100 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(100);
    shift92 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(92);
    shift20 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(20);
    shift10 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(10);
    shift17 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(17);
    shift8 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(8);
    shift67 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(67);
    shift75 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(75);
    shift49 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(49);
    shift95 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(95);
    shift29 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(29);
    shift37 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(37);
    shift5 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(5);
    shift71 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(71);
    shift7 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(7);
    shift87 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(87);
    shift50 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(50);
    shift3 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(3);
    shift86 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(86);
    shift23 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(23);
    shift102 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(102);
    shift41 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(41);
    shift76 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(76);
    shift55 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(55);
    shift60 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(60);
    shift2 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(2);
    shift107 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(107);
    shift101 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(101);
    shift99 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(99);
    shift21 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(21);
    shift89 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(89);
    shift33 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(33);
    shift19 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(19);
    shift53 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(53);
    shift35 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(35);
    shift11 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(11);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift18 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(18);
    shift65 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(65);
    shift27 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(27);
    shift47 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(47);
    shift15 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(15);
    shift25 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(25);
    shift82 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(82);
    shift58 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(58);
    shift88 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(88);
    shift80 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(80);
    shift28 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(28);
    shift31 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(31);
    shift14 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(14);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    initrcurlArray();
    initdefArray();
    initrparArray();
    initminusArray();
    initassignArray();
    initcolonArray();
    initlparArray();
    initplusArray();
    initcommaArray();
    initidArray();
    initeolArray();
    initneArray();
    inittextArray();
    initdotArray();
    initboolArray();
    initleArray();
    initclassdefArray();
    initslashArray();
    initstarArray();
    init_ifArray();
    initmodArray();
    initlcurlArray();
    initltArray();
    initorArray();
    initgtArray();
    init__eof__Array();
    initeqArray();
    initgeArray();
    initintegerArray();
    initbangArray();
    initisArray();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum.rcurl,rcurlArray);
    tableMap.put(TerminalEnum.def,defArray);
    tableMap.put(TerminalEnum.rpar,rparArray);
    tableMap.put(TerminalEnum.minus,minusArray);
    tableMap.put(TerminalEnum.assign,assignArray);
    tableMap.put(TerminalEnum.colon,colonArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    tableMap.put(TerminalEnum.plus,plusArray);
    tableMap.put(TerminalEnum.comma,commaArray);
    tableMap.put(TerminalEnum.id,idArray);
    tableMap.put(TerminalEnum.eol,eolArray);
    tableMap.put(TerminalEnum.ne,neArray);
    tableMap.put(TerminalEnum.text,textArray);
    tableMap.put(TerminalEnum.dot,dotArray);
    tableMap.put(TerminalEnum.bool,boolArray);
    tableMap.put(TerminalEnum.le,leArray);
    tableMap.put(TerminalEnum.classdef,classdefArray);
    tableMap.put(TerminalEnum.slash,slashArray);
    tableMap.put(TerminalEnum.star,starArray);
    tableMap.put(TerminalEnum._if,_ifArray);
    tableMap.put(TerminalEnum.mod,modArray);
    tableMap.put(TerminalEnum.lcurl,lcurlArray);
    tableMap.put(TerminalEnum.lt,ltArray);
    tableMap.put(TerminalEnum.or,orArray);
    tableMap.put(TerminalEnum.gt,gtArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    tableMap.put(TerminalEnum.eq,eqArray);
    tableMap.put(TerminalEnum.ge,geArray);
    tableMap.put(TerminalEnum.integer,integerArray);
    tableMap.put(TerminalEnum.bang,bangArray);
    tableMap.put(TerminalEnum.is,isArray);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.script,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),114,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0is_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.is,null);
    metadata0_else_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum._else,null);
    metadata0lcurl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lcurl,null);
    metadata0eol_metadata0reduceinstr = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceinstr);
    metadata0null_metadata0reducemember_star_0_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,reducemember_star_0_empty);
    metadata0rpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,null);
    metadata0id_star_2_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_star_2_sub,null);
    metadata0instr_plus_8_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr_plus_8,null);
    metadata0init_metadata0reduceinit_star_7_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.init,reduceinit_star_7_rec);
    metadata0field_star_1_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.field_star_1_sub,null);
    metadata0id_metadata0reduceid_star_2_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_star_2_element);
    metadata0text_metadata0reduceexpr_text = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.text,reduceexpr_text);
    metadata0member_star_0_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.member_star_0,null);
    metadata0_class_metadata0reduceclass_member = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum._class,reduceclass_member);
    metadata0id_metadata0reducefield = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reducefield);
    metadata0instr_star_3_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr_star_3,null);
    metadata0bang_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.bang,null);
    metadata0lt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lt,null);
    metadata0instr_plus_4_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr_plus_4,null);
    metadata0init_metadata0reduceinit_star_7_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.init,reduceinit_star_7_element);
    metadata0def_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.def,null);
    metadata0id_star_2_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_star_2,null);
    metadata0dot_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dot,null);
    metadata0id_metadata0reduceexpr_is = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceexpr_is);
    metadata0member_metadata0reducemember_star_0_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.member,reducemember_star_0_rec);
    metadata0field_star_1_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.field_star_1,null);
    metadata0ge_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ge,null);
    metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0eq_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eq,null);
    metadata0le_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.le,null);
    metadata0instr_metadata0reduceinstr_star_3_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceinstr_star_3_rec);
    metadata0rpar_metadata0reduceexpr_function_call = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_function_call);
    metadata0instr_metadata0reduceinstr_plus_8_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceinstr_plus_8_element);
    metadata0classdef_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.classdef,null);
    metadata0rcurl_metadata0reduceexpr_allocation = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rcurl,reduceexpr_allocation);
    metadata0script_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.script,null);
    metadata0rpar_metadata0reduceexpr_method_call = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_method_call);
    metadata0expr_star_6_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_6,null);
    metadata0star_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.star,null);
    metadata0rpar_metadata0reduceexpr_parens = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_parens);
    metadata0field_metadata0reducefield_star_1_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.field,reducefield_star_1_element);
    metadata0expr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,null);
    metadata0plus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.plus,null);
    metadata0instr_metadata0reduceinstr_plus_8_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceinstr_plus_8_rec);
    metadata0init_star_7_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.init_star_7,null);
    metadata0ne_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ne,null);
    metadata0function_metadata0reducefunction_member = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.function,reducefunction_member);
    metadata0expr_star_5_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_5,null);
    metadata0_if_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._if,null);
    metadata0instr_metadata0reduceinstr_plus_4_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceinstr_plus_4_rec);
    metadata0rpar_metadata0reduce_class = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduce_class);
    metadata0integer_metadata0reduceexpr_integer = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.integer,reduceexpr_integer);
    metadata0mod_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.mod,null);
    metadata0rpar_metadata0reduceexpr_if = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_if);
    metadata0minus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.minus,null);
    metadata0expr_star_5_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_5_sub,null);
    metadata0id_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,null);
    metadata0init_star_7_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.init_star_7_sub,null);
    metadata0comma_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.comma,null);
    metadata0expr_star_6_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_6_sub,null);
    metadata0instr_metadata0reduceinstr_plus_4_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceinstr_plus_4_element);
    metadata0colon_metadata0reduceinstr_star_3_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reduceinstr_star_3_empty);
    metadata0or_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.or,null);
    metadata0slash_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.slash,null);
    metadata0bool_metadata0reduceexpr_bool = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.bool,reduceexpr_bool);
    metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);
    metadata0id_metadata0reduceid_star_2_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_star_2_rec);
    metadata0field_metadata0reducefield_star_1_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.field,reducefield_star_1_rec);
    metadata0gt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.gt,null);
    metadata0assign_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assign,null);
    metadata0rpar_metadata0reduceexpr_if_expr = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_if_expr);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0reducemember_star_0_empty,metadata0member_star_0_metadata0null,metadata0def_metadata0null,metadata0id_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0reduceid_star_2_element,metadata0id_star_2_sub_metadata0null,metadata0comma_metadata0null,metadata0id_metadata0reduceid_star_2_rec,metadata0id_star_2_metadata0null,metadata0rpar_metadata0null,metadata0colon_metadata0reduceinstr_star_3_empty,metadata0instr_star_3_metadata0null,metadata0text_metadata0reduceexpr_text,metadata0bang_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0minus_metadata0null,metadata0plus_metadata0null,metadata0integer_metadata0reduceexpr_integer,metadata0bool_metadata0reduceexpr_bool,metadata0lpar_metadata0null,metadata0expr_metadata0null,metadata0plus_metadata0null,metadata0expr_metadata0null,metadata0is_metadata0null,metadata0id_metadata0reduceexpr_is,metadata0dot_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0expr_metadata0null,metadata0star_metadata0null,metadata0expr_metadata0null,metadata0gt_metadata0null,metadata0expr_metadata0null,metadata0minus_metadata0null,metadata0expr_metadata0null,metadata0slash_metadata0null,metadata0expr_metadata0null,metadata0ne_metadata0null,metadata0expr_metadata0null,metadata0le_metadata0null,metadata0expr_metadata0null,metadata0lt_metadata0null,metadata0expr_metadata0null,metadata0eq_metadata0null,metadata0expr_metadata0null,metadata0ge_metadata0null,metadata0expr_metadata0null,metadata0_if_metadata0null,metadata0lpar_metadata0null,metadata0instr_metadata0reduceinstr_plus_8_element,metadata0expr_metadata0null,metadata0mod_metadata0null,metadata0expr_metadata0null,metadata0or_metadata0null,metadata0instr_metadata0reduceinstr_plus_4_element,metadata0expr_metadata0null,metadata0eol_metadata0reduceinstr,metadata0_else_metadata0null,metadata0rpar_metadata0reduceexpr_if_expr,metadata0instr_plus_4_metadata0null,metadata0instr_metadata0reduceinstr_plus_4_rec,metadata0expr_metadata0null,metadata0instr_plus_8_metadata0null,metadata0or_metadata0null,metadata0_else_metadata0null,metadata0rpar_metadata0reduceexpr_if,metadata0instr_metadata0reduceinstr_plus_8_rec,metadata0lpar_metadata0null,metadata0expr_star_6_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_star_6_metadata0null,metadata0rpar_metadata0reduceexpr_method_call,metadata0rpar_metadata0reduceexpr_parens,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0lpar_metadata0null,metadata0expr_star_5_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_star_5_metadata0null,metadata0rpar_metadata0reduceexpr_function_call,metadata0lcurl_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0expr_metadata0null,metadata0init_star_7_sub_metadata0null,metadata0comma_metadata0null,metadata0init_metadata0reduceinit_star_7_rec,metadata0init_star_7_metadata0null,metadata0rcurl_metadata0reduceexpr_allocation,metadata0init_metadata0reduceinit_star_7_element,metadata0expr_metadata0null,metadata0instr_metadata0reduceinstr_star_3_rec,metadata0classdef_metadata0null,metadata0id_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0reducefield,metadata0field_metadata0reducefield_star_1_element,metadata0field_star_1_metadata0null,metadata0rpar_metadata0reduce_class,metadata0field_star_1_sub_metadata0null,metadata0comma_metadata0null,metadata0field_metadata0reducefield_star_1_rec,metadata0function_metadata0reducefunction_member,metadata0member_metadata0reducemember_star_0_rec,metadata0_class_metadata0reduceclass_member,metadata0script_metadata0null,metadata0__eof___metadata0null};
  }

  
  private int[] instr_plus_4Gotoes;

  private void initinstr_plus_4Gotoes() {
    instr_plus_4Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,61,-1,-1,-1,-1,-1,-1,-1,-1,-1,61,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_star_2_subGotoes;

  private void initid_star_2_subGotoes() {
    id_star_2_subGotoes = 
      new int[]{-1,-1,-1,-1,6,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] init_star_7Gotoes;

  private void initinit_star_7Gotoes() {
    init_star_7Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] _classGotoes;

  private void init_classGotoes() {
    _classGotoes = 
      new int[]{-1,111,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] functionGotoes;

  private void initfunctionGotoes() {
    functionGotoes = 
      new int[]{-1,109,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] scriptGotoes;

  private void initscriptGotoes() {
    scriptGotoes = 
      new int[]{112,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_6Gotoes;

  private void initexpr_star_6Gotoes() {
    expr_star_6Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,74,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] exprGotoes;

  private void initexprGotoes() {
    exprGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,63,-1,97,-1,79,78,77,-1,-1,22,-1,24,-1,-1,-1,-1,-1,30,-1,32,-1,34,-1,36,-1,38,-1,40,-1,42,-1,44,-1,46,-1,48,-1,-1,52,-1,-1,54,-1,57,-1,-1,-1,-1,-1,63,-1,-1,63,57,-1,-1,-1,73,-1,72,-1,-1,-1,-1,-1,-1,-1,-1,84,-1,83,-1,-1,-1,-1,-1,-1,90,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] member_star_0Gotoes;

  private void initmember_star_0Gotoes() {
    member_star_0Gotoes = 
      new int[]{1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] init_star_7_subGotoes;

  private void initinit_star_7_subGotoes() {
    init_star_7_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,91,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] field_star_1Gotoes;

  private void initfield_star_1Gotoes() {
    field_star_1Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] memberGotoes;

  private void initmemberGotoes() {
    memberGotoes = 
      new int[]{-1,110,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instr_star_3Gotoes;

  private void initinstr_star_3Gotoes() {
    instr_star_3Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,12,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instr_plus_8Gotoes;

  private void initinstr_plus_8Gotoes() {
    instr_plus_8Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_5Gotoes;

  private void initexpr_star_5Gotoes() {
    expr_star_5Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,85,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] initGotoes;

  private void initinitGotoes() {
    initGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,96,-1,-1,-1,-1,93,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_5_subGotoes;

  private void initexpr_star_5_subGotoes() {
    expr_star_5_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,81,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_6_subGotoes;

  private void initexpr_star_6_subGotoes() {
    expr_star_6_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrGotoes;

  private void initinstrGotoes() {
    instrGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,98,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,56,-1,-1,-1,-1,-1,62,-1,-1,68,56,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_star_2Gotoes;

  private void initid_star_2Gotoes() {
    id_star_2Gotoes = 
      new int[]{-1,-1,-1,-1,9,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] fieldGotoes;

  private void initfieldGotoes() {
    fieldGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,103,-1,-1,-1,-1,-1,108,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] _elseGotoes;

  private void init_elseGotoes() {
    _elseGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,59,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] field_star_1_subGotoes;

  private void initfield_star_1_subGotoes() {
    field_star_1_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,106,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rcurlArray;
  @SuppressWarnings("unchecked")
  private void initrcurlArray() {
    rcurlArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,branch0,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,reduceexpr_method_assignment,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_expr,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_function_call,reduceinit_star_7_empty,branch0,branch0,reduceinit,reduceinit_star_7_through,branch0,reduceinit_star_7_rec,shift95,reduceexpr_allocation,reduceinit_star_7_element,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] defArray;
  @SuppressWarnings("unchecked")
  private void initdefArray() {
    defArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,shift2,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefunction,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0,branch0,reduce_class,branch0,branch0,branch0,reducefunction_member,reducemember_star_0_rec,reduceclass_member,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceid_star_2_empty,reduceid_star_2_element,reduceid_star_2_through,branch0,reduceid_star_2_rec,shift10,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift76,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,reduceexpr_method_assignment,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_mod,reduceelse_empty,reduceinstr_plus_4_element,reduceelse_expr,reduceinstr,shift60,reduceexpr_if_expr,reduceelse_instrs,reduceinstr_plus_4_rec,branch0,branch0,reduceelse_empty,shift67,reduceexpr_if,branch0,reduceexpr_star_6_empty,reduceexpr_star_6_through,branch0,reduceexpr_star_6_rec,reduceexpr_star_6_element,shift75,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,reduceexpr_var_assignment,reduceexpr_star_5_empty,reduceexpr_star_5_through,branch0,reduceexpr_star_5_rec,reduceexpr_star_5_element,shift86,reduceexpr_function_call,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,reducefield_star_1_empty,reducefield,reducefield_star_1_element,shift105,branch0,reducefield_star_1_through,branch0,reducefield_star_1_rec,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] minusArray;
  @SuppressWarnings("unchecked")
  private void initminusArray() {
    minusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift17,reduceexpr_text,shift17,reduceexpr_var_access,shift17,shift17,shift17,reduceexpr_integer,reduceexpr_bool,shift17,shift35,shift17,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,shift17,shift35,shift17,reduceexpr_binary_mul,shift17,shift35,shift17,reduceexpr_binary_sub,shift17,reduceexpr_binary_div,shift17,shift35,shift17,shift35,shift17,shift35,shift17,shift35,shift17,shift35,branch0,shift17,reduceinstr_plus_8_element,shift35,shift17,reduceexpr_binary_mod,shift17,reduceinstr_plus_4_element,shift35,reduceinstr,branch0,reduceexpr_if_expr,shift17,reduceinstr_plus_4_rec,shift35,shift17,shift17,branch0,reduceexpr_if,reduceinstr_plus_8_rec,shift17,branch0,shift17,shift35,shift35,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift35,shift17,branch0,shift17,shift35,shift35,branch0,reduceexpr_function_call,branch0,branch0,shift17,shift35,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] assignArray;
  @SuppressWarnings("unchecked")
  private void initassignArray() {
    assignArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift89,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] colonArray;
  @SuppressWarnings("unchecked")
  private void initcolonArray() {
    colonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift21,branch0,shift21,shift80,shift21,shift21,shift21,branch0,branch0,shift21,branch0,shift21,branch0,branch0,branch0,branch0,shift69,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift50,shift21,reduceinstr_plus_8_element,branch0,shift21,branch0,shift21,reduceinstr_plus_4_element,branch0,reduceinstr,branch0,branch0,shift21,reduceinstr_plus_4_rec,branch0,shift21,shift21,branch0,branch0,reduceinstr_plus_8_rec,shift21,branch0,shift21,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift21,branch0,shift21,branch0,branch0,branch0,branch0,branch0,branch0,shift21,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_rec,branch0,shift101,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] plusArray;
  @SuppressWarnings("unchecked")
  private void initplusArray() {
    plusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift18,reduceexpr_text,shift18,reduceexpr_var_access,shift18,shift18,shift18,reduceexpr_integer,reduceexpr_bool,shift18,shift23,shift18,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,shift18,shift23,shift18,reduceexpr_binary_mul,shift18,shift23,shift18,reduceexpr_binary_sub,shift18,reduceexpr_binary_div,shift18,shift23,shift18,shift23,shift18,shift23,shift18,shift23,shift18,shift23,branch0,shift18,reduceinstr_plus_8_element,shift23,shift18,reduceexpr_binary_mod,shift18,reduceinstr_plus_4_element,shift23,reduceinstr,branch0,reduceexpr_if_expr,shift18,reduceinstr_plus_4_rec,shift23,shift18,shift18,branch0,reduceexpr_if,reduceinstr_plus_8_rec,shift18,branch0,shift18,shift23,shift23,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift23,shift18,branch0,shift18,shift23,shift23,branch0,reduceexpr_function_call,branch0,branch0,shift18,shift23,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] commaArray;
  @SuppressWarnings("unchecked")
  private void initcommaArray() {
    commaArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,reduceid_star_2_element,shift7,branch0,reduceid_star_2_rec,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,branch0,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,reduceexpr_method_assignment,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_expr,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,shift71,branch0,reduceexpr_star_6_rec,reduceexpr_star_6_element,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,reduceexpr_var_assignment,branch0,shift82,branch0,reduceexpr_star_5_rec,reduceexpr_star_5_element,branch0,reduceexpr_function_call,branch0,branch0,branch0,reduceinit,shift92,branch0,reduceinit_star_7_rec,branch0,reduceexpr_allocation,reduceinit_star_7_element,reduceexpr_unary_not,branch0,branch0,branch0,branch0,reducefield,reducefield_star_1_element,branch0,branch0,shift107,branch0,reducefield_star_1_rec,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,shift3,branch0,shift5,branch0,branch0,shift8,branch0,branch0,branch0,reduceinstr_star_3_empty,shift15,branch0,shift15,branch0,shift15,shift15,shift15,branch0,branch0,shift15,branch0,shift15,branch0,shift26,branch0,shift28,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,branch0,shift15,reduceinstr_plus_8_element,branch0,shift15,branch0,shift15,reduceinstr_plus_4_element,branch0,reduceinstr,branch0,branch0,shift15,reduceinstr_plus_4_rec,branch0,shift15,shift15,branch0,branch0,reduceinstr_plus_8_rec,shift15,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift15,branch0,shift15,branch0,branch0,branch0,branch0,shift88,branch0,shift15,branch0,branch0,shift88,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_rec,shift100,branch0,shift102,branch0,branch0,branch0,branch0,branch0,shift102,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eolArray;
  @SuppressWarnings("unchecked")
  private void initeolArray() {
    eolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,branch0,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,reduceexpr_method_assignment,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,shift58,branch0,reduceexpr_binary_mod,branch0,branch0,shift58,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift58,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_function_call,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] neArray;
  @SuppressWarnings("unchecked")
  private void initneArray() {
    neArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift39,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,shift39,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,shift39,branch0,reduceexpr_binary_mod,branch0,branch0,shift39,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift39,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,shift39,shift39,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift39,branch0,branch0,branch0,shift39,shift39,branch0,reduceexpr_function_call,branch0,branch0,branch0,shift39,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] textArray;
  @SuppressWarnings("unchecked")
  private void inittextArray() {
    textArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift13,branch0,shift13,branch0,shift13,shift13,shift13,branch0,branch0,shift13,branch0,shift13,branch0,branch0,branch0,branch0,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,branch0,shift13,reduceinstr_plus_8_element,branch0,shift13,branch0,shift13,reduceinstr_plus_4_element,branch0,reduceinstr,branch0,branch0,shift13,reduceinstr_plus_4_rec,branch0,shift13,shift13,branch0,branch0,reduceinstr_plus_8_rec,shift13,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dotArray;
  @SuppressWarnings("unchecked")
  private void initdotArray() {
    dotArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift27,branch0,shift27,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,branch0,branch0,shift27,branch0,shift27,branch0,branch0,shift27,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift27,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,shift27,shift27,branch0,reduceexpr_method_call,reduceexpr_parens,shift27,shift27,shift27,branch0,branch0,branch0,shift27,shift27,branch0,reduceexpr_function_call,branch0,branch0,branch0,shift27,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] boolArray;
  @SuppressWarnings("unchecked")
  private void initboolArray() {
    boolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift20,branch0,shift20,branch0,shift20,shift20,shift20,branch0,branch0,shift20,branch0,shift20,branch0,branch0,branch0,branch0,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,branch0,shift20,reduceinstr_plus_8_element,branch0,shift20,branch0,shift20,reduceinstr_plus_4_element,branch0,reduceinstr,branch0,branch0,shift20,reduceinstr_plus_4_rec,branch0,shift20,shift20,branch0,branch0,reduceinstr_plus_8_rec,shift20,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift20,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] leArray;
  @SuppressWarnings("unchecked")
  private void initleArray() {
    leArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift41,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,shift41,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,shift41,branch0,reduceexpr_binary_mod,branch0,branch0,shift41,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift41,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,shift41,shift41,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift41,branch0,branch0,branch0,shift41,shift41,branch0,reduceexpr_function_call,branch0,branch0,branch0,shift41,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] classdefArray;
  @SuppressWarnings("unchecked")
  private void initclassdefArray() {
    classdefArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,shift99,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefunction,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0,branch0,reduce_class,branch0,branch0,branch0,reducefunction_member,reducemember_star_0_rec,reduceclass_member,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] slashArray;
  @SuppressWarnings("unchecked")
  private void initslashArray() {
    slashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift37,branch0,shift37,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,shift37,branch0,reduceexpr_binary_mul,branch0,shift37,branch0,shift37,branch0,reduceexpr_binary_div,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,branch0,branch0,shift37,branch0,reduceexpr_binary_mod,branch0,branch0,shift37,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift37,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,shift37,shift37,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift37,branch0,branch0,branch0,shift37,shift37,branch0,reduceexpr_function_call,branch0,branch0,branch0,shift37,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] starArray;
  @SuppressWarnings("unchecked")
  private void initstarArray() {
    starArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift31,branch0,shift31,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,shift31,branch0,reduceexpr_binary_mul,branch0,shift31,branch0,shift31,branch0,reduceexpr_binary_div,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,branch0,branch0,shift31,branch0,reduceexpr_binary_mod,branch0,branch0,shift31,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift31,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,shift31,shift31,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift31,branch0,branch0,branch0,shift31,shift31,branch0,reduceexpr_function_call,branch0,branch0,branch0,shift31,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _ifArray;
  @SuppressWarnings("unchecked")
  private void init_ifArray() {
    _ifArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift49,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,shift49,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,shift49,branch0,reduceexpr_binary_mod,branch0,branch0,shift49,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift49,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,shift49,shift49,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift49,branch0,branch0,branch0,shift49,shift49,branch0,reduceexpr_function_call,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] modArray;
  @SuppressWarnings("unchecked")
  private void initmodArray() {
    modArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift53,branch0,shift53,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,shift53,branch0,reduceexpr_binary_mul,branch0,shift53,branch0,shift53,branch0,reduceexpr_binary_div,branch0,shift53,branch0,shift53,branch0,shift53,branch0,shift53,branch0,shift53,branch0,branch0,branch0,shift53,branch0,reduceexpr_binary_mod,branch0,branch0,shift53,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift53,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,shift53,shift53,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift53,branch0,branch0,branch0,shift53,shift53,branch0,reduceexpr_function_call,branch0,branch0,branch0,shift53,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lcurlArray;
  @SuppressWarnings("unchecked")
  private void initlcurlArray() {
    lcurlArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift87,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] ltArray;
  @SuppressWarnings("unchecked")
  private void initltArray() {
    ltArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift43,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,shift43,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,shift43,branch0,reduceexpr_binary_mod,branch0,branch0,shift43,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift43,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,shift43,shift43,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift43,branch0,branch0,branch0,shift43,shift43,branch0,reduceexpr_function_call,branch0,branch0,branch0,shift43,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] orArray;
  @SuppressWarnings("unchecked")
  private void initorArray() {
    orArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,branch0,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,reduceexpr_method_assignment,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,reduceinstr_plus_8_element,shift55,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,reduceinstr,branch0,reduceexpr_if_expr,branch0,branch0,branch0,shift65,branch0,branch0,reduceexpr_if,reduceinstr_plus_8_rec,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_function_call,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] gtArray;
  @SuppressWarnings("unchecked")
  private void initgtArray() {
    gtArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift33,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,shift33,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,shift33,branch0,reduceexpr_binary_mod,branch0,branch0,shift33,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift33,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,shift33,shift33,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift33,branch0,branch0,branch0,shift33,shift33,branch0,reduceexpr_function_call,branch0,branch0,branch0,shift33,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,reducescript,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefunction,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0,branch0,reduce_class,branch0,branch0,branch0,reducefunction_member,reducemember_star_0_rec,reduceclass_member,accept,accept};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eqArray;
  @SuppressWarnings("unchecked")
  private void initeqArray() {
    eqArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift45,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,shift45,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,shift45,branch0,reduceexpr_binary_mod,branch0,branch0,shift45,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift45,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,shift45,shift45,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift45,branch0,branch0,branch0,shift45,shift45,branch0,reduceexpr_function_call,branch0,branch0,branch0,shift45,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] geArray;
  @SuppressWarnings("unchecked")
  private void initgeArray() {
    geArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift47,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,shift47,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,shift47,branch0,reduceexpr_binary_mod,branch0,branch0,shift47,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift47,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,shift47,shift47,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift47,branch0,branch0,branch0,shift47,shift47,branch0,reduceexpr_function_call,branch0,branch0,branch0,shift47,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] integerArray;
  @SuppressWarnings("unchecked")
  private void initintegerArray() {
    integerArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift19,branch0,shift19,branch0,shift19,shift19,shift19,branch0,branch0,shift19,branch0,shift19,branch0,branch0,branch0,branch0,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,branch0,shift19,reduceinstr_plus_8_element,branch0,shift19,branch0,shift19,reduceinstr_plus_4_element,branch0,reduceinstr,branch0,branch0,shift19,reduceinstr_plus_4_rec,branch0,shift19,shift19,branch0,branch0,reduceinstr_plus_8_rec,shift19,branch0,shift19,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift19,branch0,shift19,branch0,branch0,branch0,branch0,branch0,branch0,shift19,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] bangArray;
  @SuppressWarnings("unchecked")
  private void initbangArray() {
    bangArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift14,branch0,shift14,branch0,shift14,shift14,shift14,branch0,branch0,shift14,branch0,shift14,branch0,branch0,branch0,branch0,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,branch0,shift14,reduceinstr_plus_8_element,branch0,shift14,branch0,shift14,reduceinstr_plus_4_element,branch0,reduceinstr,branch0,branch0,shift14,reduceinstr_plus_4_rec,branch0,shift14,shift14,branch0,branch0,reduceinstr_plus_8_rec,shift14,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] isArray;
  @SuppressWarnings("unchecked")
  private void initisArray() {
    isArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_text,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_bool,branch0,shift25,branch0,reduceexpr_binary_add,branch0,reduceexpr_is,branch0,reduceexpr_field_access,branch0,shift25,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,shift25,branch0,reduceexpr_binary_mod,branch0,branch0,shift25,branch0,branch0,reduceexpr_if_expr,branch0,branch0,shift25,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,branch0,branch0,shift25,shift25,branch0,reduceexpr_method_call,reduceexpr_parens,reduceexpr_unary_plus,reduceexpr_unary_minus,shift25,branch0,branch0,branch0,shift25,shift25,branch0,reduceexpr_function_call,branch0,branch0,branch0,shift25,branch0,branch0,branch0,branch0,reduceexpr_allocation,branch0,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,reducescript,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceinstr_star_3_empty,reducefunction,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceinstr,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceinstr_star_3_rec,error0,error0,error0,error0,error0,error0,reduce_class,error0,error0,error0,reducefunction_member,reducemember_star_0_rec,reduceclass_member,exit,exit};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_le;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ne;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_add;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceelse_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_div;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinit;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_bool;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_method_call;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_allocation;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ge;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_plus_8_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefunction;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceelse_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_lt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_method_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinit_star_7_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_star_3_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinit_star_7_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefield_star_1_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceelse_instrs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_integer;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_gt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mod;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_plus_4_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_plus_4_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducescript;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mul;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_field_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_sub;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduce_class;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_not;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_is;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinit_star_7_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefunction_member;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducemember_star_0_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefield_star_1_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_minus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefield_star_1_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_function_call;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_text;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_plus_8_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceclass_member;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_star_3_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_6_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_6_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefield_star_1_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinit_star_7_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_parens;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefield;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_eq;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_6_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_6_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_plus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducemember_star_0_empty;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift13;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift16;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift39;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift69;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift26;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift43;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift105;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift45;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift100;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift92;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift20;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift10;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift17;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift8;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift67;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift75;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift49;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift95;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift29;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift37;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift5;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift71;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift7;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift87;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift50;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift3;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift86;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift23;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift102;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift41;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift76;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift55;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift60;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift2;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift107;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift101;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift99;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift21;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift89;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift33;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift19;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift53;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift35;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift11;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift18;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift65;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift27;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift47;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift15;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift25;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift82;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift58;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift88;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift80;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift28;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift31;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift14;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0is_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_else_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lcurl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceinstr;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0reducemember_star_0_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_star_2_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_plus_8_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0init_metadata0reduceinit_star_7_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0field_star_1_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_star_2_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0text_metadata0reduceexpr_text;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0member_star_0_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_class_metadata0reduceclass_member;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reducefield;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_star_3_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0bang_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_plus_4_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0init_metadata0reduceinit_star_7_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0def_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_star_2_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dot_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceexpr_is;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0member_metadata0reducemember_star_0_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0field_star_1_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ge_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eq_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0le_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceinstr_star_3_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_function_call;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceinstr_plus_8_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0classdef_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rcurl_metadata0reduceexpr_allocation;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0script_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_method_call;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_6_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0star_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_parens;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0field_metadata0reducefield_star_1_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceinstr_plus_8_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0init_star_7_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ne_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0function_metadata0reducefunction_member;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_5_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_if_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceinstr_plus_4_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduce_class;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0integer_metadata0reduceexpr_integer;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0mod_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_if;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0minus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_5_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0init_star_7_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comma_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_6_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceinstr_plus_4_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reduceinstr_star_3_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0or_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0slash_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0bool_metadata0reduceexpr_bool;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_star_2_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0field_metadata0reducefield_star_1_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0gt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assign_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_if_expr;
}
