package com.predicate;

import java.util.function.Predicate;

public class StringLengthPredicate {
	public static void main(String[] args) {
		Predicate<String> p = s -> s.length() > 5;
		System.out.println(p.test(""));
		System.out.println(p.test("Infosys"));
		System.out.println(p.test("King"));
	}
}
