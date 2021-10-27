package com.sap.dsc.aas.lib.expressions;

import java.util.List;
import java.util.function.Function;

/**
 * Represents a call of a built-in function on one or more arguments.
 */
public class BuiltinCallExpr implements Expression {
	/**
	 * The function that is used to compute a value.
	 */
	protected final Function<Object, Object> f;
	/**
	 * Expressions for the function's arguments that are evaluated to compute
	 * the actual arguments of the function.
	 */
	protected final Expression[] args;

	public BuiltinCallExpr(Function<Object, Object> f, List<Expression> args) {
		this(f, args.toArray(new Expression[args.size()]));
	}

	public BuiltinCallExpr(Function<Object, Object> f, Expression... args) {
		this.f = f;
		this.args = args;
	}

	@Override
	public Object evaluate() {
		Object[] values = new Object[args.length];
		for (int i = 0; i < args.length; i++) {
			Expression arg = args[i];
			values[i] = arg.evaluate();
		}
		try {
			return f.apply(values);
		} catch (NumberFormatException e) {
			return Double.NaN;
		}
	}
}