package com.predicate;

import java.util.function.Predicate;

public class PredicateJoining {
	public static void main(String[] args) {
		Predicate<Integer> P1 = I -> I > 10;
		Predicate<Integer> P2 = I -> I % 2 == 0;
		int[] x = { 0, 5, 10, 15, 20, 25, 30 };
		System.out.println("The Numbers Greater Than 10:");
		m1(P1, x);
		System.out.println("The Even Numbers Are:");
		m1(P2, x);
		System.out.println("The Numbers Not Greater Than 10:");
		m1(P1.negate(), x);
		System.out.println("The Numbers Greater Than 10 And Even Are:");
		m1(P1.and(P2), x);
		System.out.println("The Numbers Greater Than 10 Or Even Are:");
		m1(P1.or(P2), x);
	}

	public static void m1(Predicate<Integer> p, int[] x) {
		for (int x1 : x) {
			if (p.test(x1)) {
				System.out.println(x1);
			}
		}
	}
}
