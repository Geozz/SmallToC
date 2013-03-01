package fr.umlv.small.interpreter.full;

import java.util.Objects;

import fr.umlv.small.grammar.ast.FunctionDefNode;

public class Function {
	private final FunctionDefNode functionDef;

	public Function(FunctionDefNode functionDef) {
		this.functionDef = Objects.requireNonNull(functionDef);
	}

	public int getParameterCount() {
		return functionDef.getParameters().size();
	}

	public FunctionDefNode getFunctionDef() {
		return functionDef;
	}

	@Override
	public String toString() {
		return functionDef.getName();
	}
}