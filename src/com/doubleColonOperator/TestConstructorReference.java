package com.doubleColonOperator;

public class TestConstructorReference {
	public static void main(String[] args) {
		Interf2 i = Sample :: new;
		i.get();
	}
}
