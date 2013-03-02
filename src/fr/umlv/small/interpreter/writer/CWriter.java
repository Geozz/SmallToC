package fr.umlv.small.interpreter.writer;

import java.io.PrintStream;
import java.util.List;

import fr.umlv.small.grammar.ast.ConstExprNode.ConstKind;
import fr.umlv.small.grammar.ast.FunctionDefNode;

public class CWriter {
	private final PrintStream out;
	private int tabs = 1;
	private boolean tab = true;
	private StringBuilder str = new StringBuilder();

	public CWriter(PrintStream out) {
	    this.out = out;
	}

	private void writeTabs() {
		for (int i = 0; i < tabs; i++) {
			str.append("  ");
		}
  }
	
	public void writeReturn() {
		writeTabs();
		str.append("return ");
	}

	public void writeSimpleReturn() {
		writeTabs();
		str.append("return;").append("\n");
	}

	public void writeSignature(String name, int size) {
	  StringBuilder sb = new StringBuilder();
	  sb = sb.append("int ").append(name).append("(");
	  for (int i = 0; i < size; i++) {
	  	// TODO handle other type 
	  	sb = sb.append("int");
	  	if (i != size - 1) {
	  		sb = sb.append(", ");
	  	}
	  }
	  sb = sb.append(") {");
	  str.append(sb).append("\n");
  }
	
	public void writeSignatureWithKinds(FunctionDefNode funDef, List<ConstKind> kinds) {
		String name = funDef.getName();
		List<String> parameters = funDef.getParameters();
	  StringBuilder sb = new StringBuilder();
	  sb = sb.append("int ").append(name).append(kindsToString(kinds)).append("(");
	  int size = kinds.size();
		for (int i = 0; i < size; i++) {
	  	ConstKind kind = kinds.get(i);
			sb.append(kindToType(kind));
	  	sb.append(parameters.get(i));
	  	sb.append(kindToString(kind));
	  	if (i != size - 1) {
	  		sb.append(", ");
	  	}
	  }
	  sb.append(") {");
	  str.append(sb).append("\n");
  }

	public void writeEndBlock() {
		str.append("}").append("\n\n");
  }

	public void writeBeginFunctionCall(String name, List<ConstKind> kinds) {
		writeTabs();
		tab = false;
		
		str.append(name + kindsToString(kinds) + "(");
  }
	
	public void writeEndFunctionCall() {
		tab = true;
		str.append(");").append("\n");
  }

	public void writeIntegerConst(Object value) {
		if (tab) {
			writeTabs();
		}
		str.append(value);
  }
	
	public void writeBoolConst(Object value) {
		if (tab) {
			writeTabs();
		}
		str.append(value.toString().toUpperCase());
  }

	public void writerConstText(Object value) {
		if (tab) {
			writeTabs();
		}
		str.append("\"" + value + "\"");
  }

	public void writeHeaders() {
		out.println("#include \"mylib.h\"");
		out.println("#define TRUE (1)");
		out.println("#define FALSE (0)");
		out.println();
  }

	public void writePrintf(List<String> format) {
		writeTabs();
		tab = false;
		str.append("printf(\"");
	  for (String s: format) {
	  	str.append(s);
	  }
	  str.append("\\n\", ");
  }

	public void writeComma() {
		str.append(',');
  }

	public void writeSpace() {
		str.append(' ');
  }

	public void writeBeginAssignement(String name, ConstKind kind) {
		writeTabs();
		tab = false;
		str.append(name + kindToString(kind) + " = ");
  }

	private String kindToType(ConstKind kind) {
		switch (kind) {
		case INTEGER:
		case BOOL:
			return "int ";
		default: //case TEXT:
			return "char* ";
		}
	}
	
	private String kindToString(ConstKind kind) {
	  String s;
	  switch (kind) {
		case INTEGER:
		case BOOL:
			s = "I";
			break;
		default: //case TEXT:
			s = "S";
			break;
		}
		return s;
	}
	
	private String kindsToString(List<ConstKind> kinds) {
		StringBuilder sb = new StringBuilder();
		
		for (ConstKind kind: kinds) {
			sb.append(kindToString(kind));
		}

		return sb.toString();
	}

	public void writeEndAssignement() {
		tab = true;
		str.append(";").append("\n");
  }

	public void writeVarAccess(String name, ConstKind constKind) {
		str.append(name + kindToString(constKind));
  }

	public void writeType(ConstKind kind) {
		writeTabs();
	  str.append(kindToType(kind)).append(" ");
  }

	public StringBuilder getStringBuilder() {
	  return str;
  }
	
	public void setStringBuilder(StringBuilder sb) {
	  str = sb;
  }

	public void writeStringBuilder() {
	  out.append(str.toString());
  }
}
