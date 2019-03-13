package com.function;

import java.util.function.Function;

public class RemoveSpace {
	public static void main(String[] args) {
		Function<String, String> f = s ->s.replace(" ", "");
		System.out.println(f.apply("ro     h   i    t"));
	}
}
