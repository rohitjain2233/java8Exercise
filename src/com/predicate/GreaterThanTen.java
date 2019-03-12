package com.predicate;

import java.util.function.Predicate;

public class GreaterThanTen {
	public static void main(String[] args) {
		Predicate<Integer> p = I -> I > 10;
		System.out.println(p.test(1));
		System.out.println(p.test(11));
		//System.out.println(p.test("abc")); //Error
	}
}
