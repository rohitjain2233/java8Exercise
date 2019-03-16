package com.doubleColonOperator;


public class TestMethodReferenceByDoubleColon {
	public static void m2(){
		System.out.println("Mathod reference");
	}
	public static void main(String[] args) {
		Interf i = TestMethodReferenceByDoubleColon :: m2;
		i.m1();
	}
}
