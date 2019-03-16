package com.function;

import java.util.function.Function;

public class FunctionIdentify {
	public static void main(String[] args) {
		Function<String,String> f1= Function.identity(); //:- it will return a function always return same input which we provide.
		String s2= f1.apply("raj"); 
		System.out.println(s2);
	}
}
