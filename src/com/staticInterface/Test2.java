package com.staticInterface;

public class Test2 implements Interf {
	public void m1(){
		System.out.println("In normal java class we cant override static method with "
				+ "non static method but here it is not guving error because this is"
				+ "not overridden method.");
	}
}
