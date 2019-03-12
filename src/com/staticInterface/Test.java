package com.staticInterface;

public class Test implements Interf {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Test t = new Test();
		// t.m1(); //Error
		// Test.m1(); //Error
		Interf.m1();
	}
	
	public static void m1(){
		System.out.println("This is not overriding method.. this is noraml method");
	}
}
