package com.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Example1 {
	public static void main(String[] args) {
		//Write a supplier to supply system date
		Supplier<Date> s = ()->new Date();
		System.out.println(s.get());
		System.out.println(s.get().getTime());
		
		System.out.println();
		System.out.println("Write a supplier to supply random name");
		Supplier<String> s1 = ()->{
			String [] names = {"Sunny","Bunny","Chinny","vinny"};
			int x = (int) (Math.random()*4); //Math.random always return from 0.0 to 10.0			
			return names[x];
		};
		System.out.println(s1.get());
	}
}
