package com.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveEmptyAndNullFromList {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("");
		names.add("Anand");
		names.add(null);
		names.add("Ram");
		names.add(" ");
		System.out.println("Before removing empty and null values: ");
		System.out.println(names);
		Predicate<String> p = s -> s != null && !s.isEmpty();
		ArrayList<String> filterList = new ArrayList<>();
		for (String name : names) {
			if (p.test(name)) {
				filterList.add(name);
			}
		}
		System.out.println("After removing empty and null values: ");
		System.out.println(filterList);
	}
}
