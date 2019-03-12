package com.DefaultInterface;

public class TestWithDefaultMethodImplementation implements Left, Right{
	@Override
	public void m1() {
		Left.super.m1();
	}
	public static void main(String[] args) {
		TestWithDefaultMethodImplementation test = new TestWithDefaultMethodImplementation();
		test.m1();
	}
}
