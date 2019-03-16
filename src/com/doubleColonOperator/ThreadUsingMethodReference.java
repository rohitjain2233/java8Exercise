package com.doubleColonOperator;

public class ThreadUsingMethodReference {
	public void m1(){
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {
		ThreadUsingMethodReference test = new ThreadUsingMethodReference();
		Thread t = new Thread(test :: m1);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
