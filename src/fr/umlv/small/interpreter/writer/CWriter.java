package fr.umlv.small.interpreter.writer;

import java.io.PrintStream;
import java.util.List;

import fr.umlv.small.grammar.ast.ConstExprNode.ConstKind;

public class CWriter {
	private final PrintStream out;
	private int tabs = 0;
	private boolean tab = true;

	public CWriter(PrintStream out) {
	    this.out = out;
	}

	private void writeTabs() {
		for (int i = 0; i < tabs; i++) {
			out.print("  ");
		}
  }
	
	public void writeReturn() {
		writeTabs();
		out.print("return ");
		
	}

	public void writeSimpleReturn() {
		writeTabs();
		out.println("return;");
	}

	public void writeSignature(String name, int size) {
		writeTabs();
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
	  out.println(sb);
	  tabs++;
  }

	public void writeEndBlock() {
		tabs--;
		writeTabs();
	  out.println("}");
  }

	public void writeBeginFunctionCall(String name) {
		writeTabs();
		tab = false;
	  out.print(name + "(");
  }
	
	public void writeEndFunctionCall() {
		tab = true;
		out.println(");");
  }

	public void writeIntegerConst(Object value) {
		if (tab) {
			writeTabs();
		}
	  out.print(value);
  }
	
	public void writeBoolConst(Object value) {
		if (tab) {
			writeTabs();
		}
	  out.print(value.toString().toUpperCase());
  }

	public void writerConstText(Object value) {
		if (tab) {
			writeTabs();
		}
	  out.print("\"" + value + "\"");
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
	  out.print("printf(\"");
	  for (String s: format) {
	  	out.print(s);
	  }
	  out.print("\\n\", ");
  }

	public void writeComma() {
	  out.print(',');
  }

	public void writeSpace() {
	  out.print(' ');
  }

	public void writeBeginAssignement(String name, ConstKind kind) {
		writeTabs();
		tab = false;
	  out.print(name + kindToString(kind) + " = ");
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

	public void writeEndAssignement() {
		tab = true;
	  out.println(";");
  }

	public void writeVarAccess(String name, ConstKind constKind) {
	  out.print(name + kindToString(constKind));
  }

	public void writeType(ConstKind kind) {
		writeTabs();
	  switch (kind) {
		case INTEGER:
		case BOOL:
			out.print("int ");
			break;
		default: //case TEXT:
			out.print("char* ");
			break;
		}
  }
}
