package com.primitiveInterface;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class TestPrimitivePredicate {
	public static void main(String[] args) {
		IntPredicate p = i -> i%2==0;
		System.out.println(p.test(10));
		DoublePredicate p1 = d -> d%2==0;
		System.out.println(p1.test(10.0));
		LongPredicate p2 = l -> l%2==0;
		System.out.println(p2.test(9999999999999l));
	}
}
