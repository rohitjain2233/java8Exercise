package com.biInterface;

import java.util.function.BiConsumer;

public class TestBiConsumer {
	public static void main(String[] args) {
		BiConsumer<String, String> c = (s1,s2) -> System.out.println(s1+s2);
		c.accept("Durga", "Soft");
	}
}
