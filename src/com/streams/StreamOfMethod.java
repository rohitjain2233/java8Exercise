package com.streams;

import java.util.stream.Stream;

public class StreamOfMethod {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		
		Double[] d = {10.0,10.1,10.2,11.0};
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(System.out::println);
	}
}
