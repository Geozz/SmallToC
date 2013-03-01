package fr.umlv.small.grammar.lexer;

import fr.umlv.small.grammar.lexer.RuleEnum;
import fr.umlv.tatoo.runtime.lexer.LexerTable;
import fr.umlv.tatoo.runtime.lexer.rules.RuleData;
import fr.umlv.tatoo.runtime.regex.CharRegexTable;
import java.util.EnumMap;
/** 
 *  This class is generated - please do not edit it 
 */
public class LexerDataTable {

  public static LexerTable<RuleEnum> createTable() {
    return new LexerDataTable().table;
  }

  private LexerDataTable() {
    initplusMainAccepts();
    initplusMainTransitions();
    CharRegexTable plusMain = new CharRegexTable(0, plusMainTransitions, plusMainAccepts);
    RuleData plus = new RuleData(plusMain, null, 0, false);
    initminusMainAccepts();
    initminusMainTransitions();
    CharRegexTable minusMain = new CharRegexTable(1, minusMainTransitions, minusMainAccepts);
    RuleData minus = new RuleData(minusMain, null, 1, false);
    initstarMainAccepts();
    initstarMainTransitions();
    CharRegexTable starMain = new CharRegexTable(1, starMainTransitions, starMainAccepts);
    RuleData star = new RuleData(starMain, null, 2, false);
    initslashMainAccepts();
    initslashMainTransitions();
    CharRegexTable slashMain = new CharRegexTable(1, slashMainTransitions, slashMainAccepts);
    RuleData slash = new RuleData(slashMain, null, 3, false);
    initmodMainAccepts();
    initmodMainTransitions();
    CharRegexTable modMain = new CharRegexTable(0, modMainTransitions, modMainAccepts);
    RuleData mod = new RuleData(modMain, null, 4, false);
    initassignMainAccepts();
    initassignMainTransitions();
    CharRegexTable assignMain = new CharRegexTable(1, assignMainTransitions, assignMainAccepts);
    RuleData assign = new RuleData(assignMain, null, 5, false);
    initeqMainAccepts();
    initeqMainTransitions();
    CharRegexTable eqMain = new CharRegexTable(1, eqMainTransitions, eqMainAccepts);
    RuleData eq = new RuleData(eqMain, null, 6, false);
    initneMainAccepts();
    initneMainTransitions();
    CharRegexTable neMain = new CharRegexTable(2, neMainTransitions, neMainAccepts);
    RuleData ne = new RuleData(neMain, null, 7, false);
    initltMainAccepts();
    initltMainTransitions();
    CharRegexTable ltMain = new CharRegexTable(0, ltMainTransitions, ltMainAccepts);
    RuleData lt = new RuleData(ltMain, null, 8, false);
    initleMainAccepts();
    initleMainTransitions();
    CharRegexTable leMain = new CharRegexTable(0, leMainTransitions, leMainAccepts);
    RuleData le = new RuleData(leMain, null, 9, false);
    initgtMainAccepts();
    initgtMainTransitions();
    CharRegexTable gtMain = new CharRegexTable(0, gtMainTransitions, gtMainAccepts);
    RuleData gt = new RuleData(gtMain, null, 10, false);
    initgeMainAccepts();
    initgeMainTransitions();
    CharRegexTable geMain = new CharRegexTable(1, geMainTransitions, geMainAccepts);
    RuleData ge = new RuleData(geMain, null, 11, false);
    initdotMainAccepts();
    initdotMainTransitions();
    CharRegexTable dotMain = new CharRegexTable(0, dotMainTransitions, dotMainAccepts);
    RuleData dot = new RuleData(dotMain, null, 12, false);
    initbangMainAccepts();
    initbangMainTransitions();
    CharRegexTable bangMain = new CharRegexTable(1, bangMainTransitions, bangMainAccepts);
    RuleData bang = new RuleData(bangMain, null, 13, false);
    initorMainAccepts();
    initorMainTransitions();
    CharRegexTable orMain = new CharRegexTable(1, orMainTransitions, orMainAccepts);
    RuleData or = new RuleData(orMain, null, 14, false);
    init_ifMainAccepts();
    init_ifMainTransitions();
    CharRegexTable _ifMain = new CharRegexTable(0, _ifMainTransitions, _ifMainAccepts);
    RuleData _if = new RuleData(_ifMain, null, 15, false);
    initisMainAccepts();
    initisMainTransitions();
    CharRegexTable isMain = new CharRegexTable(1, isMainTransitions, isMainAccepts);
    RuleData is = new RuleData(isMain, null, 16, false);
    initcolonMainAccepts();
    initcolonMainTransitions();
    CharRegexTable colonMain = new CharRegexTable(0, colonMainTransitions, colonMainAccepts);
    RuleData colon = new RuleData(colonMain, null, 17, false);
    initcommaMainAccepts();
    initcommaMainTransitions();
    CharRegexTable commaMain = new CharRegexTable(0, commaMainTransitions, commaMainAccepts);
    RuleData comma = new RuleData(commaMain, null, 18, false);
    initeolMainAccepts();
    initeolMainTransitions();
    CharRegexTable eolMain = new CharRegexTable(0, eolMainTransitions, eolMainAccepts);
    RuleData eol = new RuleData(eolMain, null, 19, false);
    initlparMainAccepts();
    initlparMainTransitions();
    CharRegexTable lparMain = new CharRegexTable(1, lparMainTransitions, lparMainAccepts);
    RuleData lpar = new RuleData(lparMain, null, 20, false);
    initrparMainAccepts();
    initrparMainTransitions();
    CharRegexTable rparMain = new CharRegexTable(0, rparMainTransitions, rparMainAccepts);
    RuleData rpar = new RuleData(rparMain, null, 21, false);
    initlcurlMainAccepts();
    initlcurlMainTransitions();
    CharRegexTable lcurlMain = new CharRegexTable(0, lcurlMainTransitions, lcurlMainAccepts);
    RuleData lcurl = new RuleData(lcurlMain, null, 22, false);
    initrcurlMainAccepts();
    initrcurlMainTransitions();
    CharRegexTable rcurlMain = new CharRegexTable(0, rcurlMainTransitions, rcurlMainAccepts);
    RuleData rcurl = new RuleData(rcurlMain, null, 23, false);
    initclassdefMainAccepts();
    initclassdefMainTransitions();
    CharRegexTable classdefMain = new CharRegexTable(7, classdefMainTransitions, classdefMainAccepts);
    RuleData classdef = new RuleData(classdefMain, null, 24, false);
    initdefMainAccepts();
    initdefMainTransitions();
    CharRegexTable defMain = new CharRegexTable(1, defMainTransitions, defMainAccepts);
    RuleData def = new RuleData(defMain, null, 25, false);
    initboolMainAccepts();
    initboolMainTransitions();
    CharRegexTable boolMain = new CharRegexTable(0, boolMainTransitions, boolMainAccepts);
    RuleData bool = new RuleData(boolMain, null, 26, false);
    initidMainAccepts();
    initidMainTransitions();
    CharRegexTable idMain = new CharRegexTable(0, idMainTransitions, idMainAccepts);
    RuleData id = new RuleData(idMain, null, 27, false);
    inittextMainAccepts();
    inittextMainTransitions();
    CharRegexTable textMain = new CharRegexTable(2, textMainTransitions, textMainAccepts);
    RuleData text = new RuleData(textMain, null, 28, false);
    initintegerMainAccepts();
    initintegerMainTransitions();
    CharRegexTable integerMain = new CharRegexTable(1, integerMainTransitions, integerMainAccepts);
    RuleData integer = new RuleData(integerMain, null, 29, false);
    initspaceMainAccepts();
    initspaceMainTransitions();
    CharRegexTable spaceMain = new CharRegexTable(1, spaceMainTransitions, spaceMainAccepts);
    RuleData space = new RuleData(spaceMain, null, 30, false);
    initcommentMainAccepts();
    initcommentMainTransitions();
    CharRegexTable commentMain = new CharRegexTable(3, commentMainTransitions, commentMainAccepts);
    RuleData comment = new RuleData(commentMain, null, 31, false);

    EnumMap<RuleEnum,RuleData> datas = new EnumMap<RuleEnum,RuleData>(RuleEnum.class);
    datas.put(RuleEnum.plus, plus);
    datas.put(RuleEnum.minus, minus);
    datas.put(RuleEnum.star, star);
    datas.put(RuleEnum.slash, slash);
    datas.put(RuleEnum.mod, mod);
    datas.put(RuleEnum.assign, assign);
    datas.put(RuleEnum.eq, eq);
    datas.put(RuleEnum.ne, ne);
    datas.put(RuleEnum.lt, lt);
    datas.put(RuleEnum.le, le);
    datas.put(RuleEnum.gt, gt);
    datas.put(RuleEnum.ge, ge);
    datas.put(RuleEnum.dot, dot);
    datas.put(RuleEnum.bang, bang);
    datas.put(RuleEnum.or, or);
    datas.put(RuleEnum._if, _if);
    datas.put(RuleEnum.is, is);
    datas.put(RuleEnum.colon, colon);
    datas.put(RuleEnum.comma, comma);
    datas.put(RuleEnum.eol, eol);
    datas.put(RuleEnum.lpar, lpar);
    datas.put(RuleEnum.rpar, rpar);
    datas.put(RuleEnum.lcurl, lcurl);
    datas.put(RuleEnum.rcurl, rcurl);
    datas.put(RuleEnum.classdef, classdef);
    datas.put(RuleEnum.def, def);
    datas.put(RuleEnum.bool, bool);
    datas.put(RuleEnum.id, id);
    datas.put(RuleEnum.text, text);
    datas.put(RuleEnum.integer, integer);
    datas.put(RuleEnum.space, space);
    datas.put(RuleEnum.comment, comment);
    table = new LexerTable<RuleEnum>(datas);
  }

  
  private boolean[] plusMainAccepts;
  private void initplusMainAccepts() {
    plusMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] plusMainTransitions;
  private void initplusMainTransitions() {
    plusMainTransitions = new int[][] {{0,-1,43,1,44,-1},{0,-1}};
  }
  
  private boolean[] minusMainAccepts;
  private void initminusMainAccepts() {
    minusMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] minusMainTransitions;
  private void initminusMainTransitions() {
    minusMainTransitions = new int[][] {{0,-1},{0,-1,45,0,46,-1}};
  }
  
  private boolean[] starMainAccepts;
  private void initstarMainAccepts() {
    starMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] starMainTransitions;
  private void initstarMainTransitions() {
    starMainTransitions = new int[][] {{0,-1},{0,-1,42,0,43,-1}};
  }
  
  private boolean[] slashMainAccepts;
  private void initslashMainAccepts() {
    slashMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] slashMainTransitions;
  private void initslashMainTransitions() {
    slashMainTransitions = new int[][] {{0,-1},{0,-1,47,0,48,-1}};
  }
  
  private boolean[] modMainAccepts;
  private void initmodMainAccepts() {
    modMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] modMainTransitions;
  private void initmodMainTransitions() {
    modMainTransitions = new int[][] {{0,-1,37,1,38,-1},{0,-1}};
  }
  
  private boolean[] assignMainAccepts;
  private void initassignMainAccepts() {
    assignMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] assignMainTransitions;
  private void initassignMainTransitions() {
    assignMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1}};
  }
  
  private boolean[] eqMainAccepts;
  private void initeqMainAccepts() {
    eqMainAccepts = new boolean[] {false,false,true};
  }
    
  private int[][] eqMainTransitions;
  private void initeqMainTransitions() {
    eqMainTransitions = new int[][] {{0,-1,61,2,62,-1},{0,-1,61,0,62,-1},{0,-1}};
  }
  
  private boolean[] neMainAccepts;
  private void initneMainAccepts() {
    neMainAccepts = new boolean[] {false,true,false};
  }
    
  private int[][] neMainTransitions;
  private void initneMainTransitions() {
    neMainTransitions = new int[][] {{0,-1,61,1,62,-1},{0,-1},{0,-1,33,0,34,-1}};
  }
  
  private boolean[] ltMainAccepts;
  private void initltMainAccepts() {
    ltMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] ltMainTransitions;
  private void initltMainTransitions() {
    ltMainTransitions = new int[][] {{0,-1,60,1,61,-1},{0,-1}};
  }
  
  private boolean[] leMainAccepts;
  private void initleMainAccepts() {
    leMainAccepts = new boolean[] {false,true,false};
  }
    
  private int[][] leMainTransitions;
  private void initleMainTransitions() {
    leMainTransitions = new int[][] {{0,-1,60,2,61,-1},{0,-1},{0,-1,61,1,62,-1}};
  }
  
  private boolean[] gtMainAccepts;
  private void initgtMainAccepts() {
    gtMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] gtMainTransitions;
  private void initgtMainTransitions() {
    gtMainTransitions = new int[][] {{0,-1,62,1,63,-1},{0,-1}};
  }
  
  private boolean[] geMainAccepts;
  private void initgeMainAccepts() {
    geMainAccepts = new boolean[] {false,false,true};
  }
    
  private int[][] geMainTransitions;
  private void initgeMainTransitions() {
    geMainTransitions = new int[][] {{0,-1,61,2,62,-1},{0,-1,62,0,63,-1},{0,-1}};
  }
  
  private boolean[] dotMainAccepts;
  private void initdotMainAccepts() {
    dotMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] dotMainTransitions;
  private void initdotMainTransitions() {
    dotMainTransitions = new int[][] {{0,-1,46,1,47,-1},{0,-1}};
  }
  
  private boolean[] bangMainAccepts;
  private void initbangMainAccepts() {
    bangMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] bangMainTransitions;
  private void initbangMainTransitions() {
    bangMainTransitions = new int[][] {{0,-1},{0,-1,33,0,34,-1}};
  }
  
  private boolean[] orMainAccepts;
  private void initorMainAccepts() {
    orMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] orMainTransitions;
  private void initorMainTransitions() {
    orMainTransitions = new int[][] {{0,-1},{0,-1,124,0,125,-1}};
  }
  
  private boolean[] _ifMainAccepts;
  private void init_ifMainAccepts() {
    _ifMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] _ifMainTransitions;
  private void init_ifMainTransitions() {
    _ifMainTransitions = new int[][] {{0,-1,63,1,64,-1},{0,-1}};
  }
  
  private boolean[] isMainAccepts;
  private void initisMainAccepts() {
    isMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] isMainTransitions;
  private void initisMainTransitions() {
    isMainTransitions = new int[][] {{0,-1},{0,-1,126,0,127,-1}};
  }
  
  private boolean[] colonMainAccepts;
  private void initcolonMainAccepts() {
    colonMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] colonMainTransitions;
  private void initcolonMainTransitions() {
    colonMainTransitions = new int[][] {{0,-1,58,1,59,-1},{0,-1}};
  }
  
  private boolean[] commaMainAccepts;
  private void initcommaMainAccepts() {
    commaMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] commaMainTransitions;
  private void initcommaMainTransitions() {
    commaMainTransitions = new int[][] {{0,-1,44,1,45,-1},{0,-1}};
  }
  
  private boolean[] eolMainAccepts;
  private void initeolMainAccepts() {
    eolMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] eolMainTransitions;
  private void initeolMainTransitions() {
    eolMainTransitions = new int[][] {{0,-1,10,1,11,-1},{0,-1}};
  }
  
  private boolean[] lparMainAccepts;
  private void initlparMainAccepts() {
    lparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lparMainTransitions;
  private void initlparMainTransitions() {
    lparMainTransitions = new int[][] {{0,-1},{0,-1,40,0,41,-1}};
  }
  
  private boolean[] rparMainAccepts;
  private void initrparMainAccepts() {
    rparMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] rparMainTransitions;
  private void initrparMainTransitions() {
    rparMainTransitions = new int[][] {{0,-1,41,1,42,-1},{0,-1}};
  }
  
  private boolean[] lcurlMainAccepts;
  private void initlcurlMainAccepts() {
    lcurlMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] lcurlMainTransitions;
  private void initlcurlMainTransitions() {
    lcurlMainTransitions = new int[][] {{0,-1,123,1,124,-1},{0,-1}};
  }
  
  private boolean[] rcurlMainAccepts;
  private void initrcurlMainAccepts() {
    rcurlMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] rcurlMainTransitions;
  private void initrcurlMainTransitions() {
    rcurlMainTransitions = new int[][] {{0,-1,125,1,126,-1},{0,-1}};
  }
  
  private boolean[] classdefMainAccepts;
  private void initclassdefMainAccepts() {
    classdefMainAccepts = new boolean[] {false,false,false,false,true,false,false,false,false};
  }
    
  private int[][] classdefMainTransitions;
  private void initclassdefMainTransitions() {
    classdefMainTransitions = new int[][] {{0,-1,115,2,116,-1},{0,-1,97,5,98,-1},{0,-1,100,8,101,-1},{0,-1,108,1,109,-1},{0,-1},{0,-1,115,0,116,-1},{0,-1,102,4,103,-1},{0,-1,99,3,100,-1},{0,-1,101,6,102,-1}};
  }
  
  private boolean[] defMainAccepts;
  private void initdefMainAccepts() {
    defMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] defMainTransitions;
  private void initdefMainTransitions() {
    defMainTransitions = new int[][] {{0,-1},{0,-1,100,3,101,-1},{0,-1,102,0,103,-1},{0,-1,101,2,102,-1}};
  }
  
  private boolean[] boolMainAccepts;
  private void initboolMainAccepts() {
    boolMainAccepts = new boolean[] {false,false,false,false,false,true,false,false};
  }
    
  private int[][] boolMainTransitions;
  private void initboolMainTransitions() {
    boolMainTransitions = new int[][] {{0,-1,102,6,103,-1,116,1,117,-1},{0,-1,114,2,115,-1},{0,-1,117,7,118,-1},{0,-1,115,7,116,-1},{0,-1,108,3,109,-1},{0,-1},{0,-1,97,4,98,-1},{0,-1,101,5,102,-1}};
  }
  
  private boolean[] idMainAccepts;
  private void initidMainAccepts() {
    idMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] idMainTransitions;
  private void initidMainTransitions() {
    idMainTransitions = new int[][] {{0,-1,65,1,91,-1,95,1,96,-1,97,1,123,-1},{0,-1,48,1,58,-1,65,1,91,-1,95,1,96,-1,97,1,123,-1}};
  }
  
  private boolean[] textMainAccepts;
  private void inittextMainAccepts() {
    textMainAccepts = new boolean[] {false,true,false};
  }
    
  private int[][] textMainTransitions;
  private void inittextMainTransitions() {
    textMainTransitions = new int[][] {{0,0,34,1,35,0},{0,-1},{0,-1,34,0,35,-1}};
  }
  
  private boolean[] integerMainAccepts;
  private void initintegerMainAccepts() {
    integerMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] integerMainTransitions;
  private void initintegerMainTransitions() {
    integerMainTransitions = new int[][] {{0,-1,48,0,58,-1},{0,-1,48,0,58,-1}};
  }
  
  private boolean[] spaceMainAccepts;
  private void initspaceMainAccepts() {
    spaceMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] spaceMainTransitions;
  private void initspaceMainTransitions() {
    spaceMainTransitions = new int[][] {{0,-1},{0,-1,9,0,11,-1,13,0,14,-1,32,0,33,-1}};
  }
  
  private boolean[] commentMainAccepts;
  private void initcommentMainAccepts() {
    commentMainAccepts = new boolean[] {false,false,false,false,true};
  }
    
  private int[][] commentMainTransitions;
  private void initcommentMainTransitions() {
    commentMainTransitions = new int[][] {{0,0,10,4,11,0,13,1,14,0},{0,-1,10,4,11,-1},{0,-1,47,0,48,-1},{0,-1,47,2,48,-1},{0,-1}};
  }
  
  private final LexerTable<RuleEnum> table;
}
