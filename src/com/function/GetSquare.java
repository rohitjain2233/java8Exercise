package com.function;

import java.util.function.Function;

public class GetSquare {
	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i*i;
		System.out.println(f.apply(10));
	}

}
