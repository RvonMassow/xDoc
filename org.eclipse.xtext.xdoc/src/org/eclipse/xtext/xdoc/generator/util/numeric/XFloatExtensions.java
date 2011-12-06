package org.eclipse.xtext.xdoc.generator.util.numeric;

import org.eclipse.xtext.xdoc.generator.util.XFloat;

public class XFloatExtensions {

	public static XFloat operator_divide(Integer a, XFloat b) {
		return new XFloat(a / b.toFloat());
	}

	public static Boolean operator_greaterThan(Integer a, XFloat b) {
		return a > b.toFloat();
	}

	public static Boolean operator_greaterThan(XFloat a, Integer b) {
		return a.toFloat() > b;
	}
}
