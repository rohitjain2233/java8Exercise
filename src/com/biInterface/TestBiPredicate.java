package com.biInterface;

import java.util.function.BiPredicate;

public class TestBiPredicate {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p = (a,b) -> (a+b) % 2 ==0;
		System.out.println(p.test(2, 7));
		System.out.println(p.test(2, 6));
	}

}
