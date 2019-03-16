package com.supplier;

import java.util.function.Supplier;

public class RandomPassword {
	public static void main(String[] args) {
		// 1. Length should be 8
		// 2. 2,4,6,8 places should be digits
		// 3. 1,3,5,7 places should be uppercase characters or @,#,$
		int passwordLength = 8;
		Supplier<String> s = () -> {
			String password = "";
			Supplier<Integer> d = () -> (int) (Math.random() * 10);
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> c = () -> symbols.charAt((int) (Math.random() * 29));
			for (int i = 1; i <= passwordLength; i++) {
				if (i % 2 == 0) {
					password = password + d.get();
				} else {
					password = password + c.get();
				}
			}
			return password;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}
}
