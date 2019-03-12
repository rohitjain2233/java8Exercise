package com.DefaultInterface;

public interface Left {
	default void m1() {
		System.out.println("Left interface default method..");
	}
}
