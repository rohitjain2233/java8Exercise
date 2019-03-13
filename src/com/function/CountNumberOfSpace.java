package com.function;

import java.util.function.Function;

public class CountNumberOfSpace {
	public static void main(String[] args) {
		Function<String, Integer> f = s1->s1.length() - s1.replaceAll(" ","").length();
		System.out.println(f.apply("ranu ji damoh"));
	}
}
