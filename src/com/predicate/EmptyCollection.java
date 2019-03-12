package com.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class EmptyCollection {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Predicate<Collection> p = c -> c.isEmpty();
		ArrayList list = new ArrayList();
		System.out.println(p.test(list));
		ArrayList list1 = new ArrayList();
		list1.add("abc");
		System.out.println(p.test(list1));
	}
}
