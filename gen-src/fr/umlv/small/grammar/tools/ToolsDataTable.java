package fr.umlv.small.grammar.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import fr.umlv.small.grammar.lexer.RuleEnum;
import fr.umlv.small.grammar.parser.TerminalEnum;

public class ToolsDataTable {
  public static ToolsTable<RuleEnum,TerminalEnum> createToolsTable() {
      EnumSet<RuleEnum> spawns = EnumSet.of(RuleEnum.def,RuleEnum.lcurl,RuleEnum._if,RuleEnum.id,RuleEnum.ge,RuleEnum.rpar,RuleEnum.bang,RuleEnum.bool,RuleEnum.plus,RuleEnum.rcurl,RuleEnum.is,RuleEnum.dot,RuleEnum.ne,RuleEnum.eq,RuleEnum.comment,RuleEnum.classdef,RuleEnum.le,RuleEnum.text,RuleEnum.comma,RuleEnum.gt,RuleEnum.assign,RuleEnum.or,RuleEnum.minus,RuleEnum.eol,RuleEnum.integer,RuleEnum.slash,RuleEnum.colon,RuleEnum.lpar,RuleEnum.lt,RuleEnum.star,RuleEnum.mod);
      EnumSet<RuleEnum> discards = EnumSet.allOf(RuleEnum.class);
      EnumMap<RuleEnum,TerminalEnum> terminal = new EnumMap<RuleEnum,TerminalEnum>(RuleEnum.class);
              terminal.put(RuleEnum.def,TerminalEnum.def);
              terminal.put(RuleEnum.lcurl,TerminalEnum.lcurl);
              terminal.put(RuleEnum.id,TerminalEnum.id);
              terminal.put(RuleEnum._if,TerminalEnum._if);
              terminal.put(RuleEnum.ge,TerminalEnum.ge);
              terminal.put(RuleEnum.bang,TerminalEnum.bang);
              terminal.put(RuleEnum.rpar,TerminalEnum.rpar);
              terminal.put(RuleEnum.bool,TerminalEnum.bool);
              terminal.put(RuleEnum.plus,TerminalEnum.plus);
              terminal.put(RuleEnum.rcurl,TerminalEnum.rcurl);
              terminal.put(RuleEnum.dot,TerminalEnum.dot);
              terminal.put(RuleEnum.is,TerminalEnum.is);
              terminal.put(RuleEnum.ne,TerminalEnum.ne);
              terminal.put(RuleEnum.eq,TerminalEnum.eq);
              terminal.put(RuleEnum.classdef,TerminalEnum.classdef);
              terminal.put(RuleEnum.le,TerminalEnum.le);
              terminal.put(RuleEnum.text,TerminalEnum.text);
              terminal.put(RuleEnum.comma,TerminalEnum.comma);
              terminal.put(RuleEnum.gt,TerminalEnum.gt);
              terminal.put(RuleEnum.assign,TerminalEnum.assign);
              terminal.put(RuleEnum.or,TerminalEnum.or);
              terminal.put(RuleEnum.minus,TerminalEnum.minus);
              terminal.put(RuleEnum.eol,TerminalEnum.eol);
              terminal.put(RuleEnum.integer,TerminalEnum.integer);
              terminal.put(RuleEnum.slash,TerminalEnum.slash);
              terminal.put(RuleEnum.colon,TerminalEnum.colon);
              terminal.put(RuleEnum.lpar,TerminalEnum.lpar);
              terminal.put(RuleEnum.lt,TerminalEnum.lt);
              terminal.put(RuleEnum.mod,TerminalEnum.mod);
              terminal.put(RuleEnum.star,TerminalEnum.star);
            EnumSet<RuleEnum> unconditionals = EnumSet.of(RuleEnum.space,RuleEnum.comment);
      return new ToolsTable<RuleEnum,TerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}