package com.biInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class StudentObjectUsingBiFunction {
	public static void main(String[] args) {
		BiFunction<String, Integer, Student> f = (s,i) -> new Student(s, i);
		ArrayList<Student> list = new ArrayList<>();
		list.add(f.apply("Raja", 67));
		list.add(f.apply("Ravi", 75));
		list.add(f.apply("Kapil", 93));
		System.out.println(list);
	}

}
