package com.primitiveInterface;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class TestPrimitiveFunction {
	public static void main(String[] args) {
		IntFunction<Integer> f = i -> i*i;
		System.out.println(f.apply(20));
		//Here one autoboxing is required because return type is Integer
		
		ToIntFunction<String> f1 = s -> s.length();
		System.out.println(f1.applyAsInt("Raj")); //here autoboxing is not required becuase return type is int only.
		
		IntToDoubleFunction f2 = i -> Math.sqrt(i);
		System.out.println(f2.applyAsDouble(45));
		
		
	}
}
