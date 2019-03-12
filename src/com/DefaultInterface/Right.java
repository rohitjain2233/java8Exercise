package com.DefaultInterface;

public interface Right {
	default void m1() {
		System.out.println("Right interface default method..");
	}
}
