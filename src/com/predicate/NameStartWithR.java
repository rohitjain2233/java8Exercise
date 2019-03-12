package com.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class NameStartWithR {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Raja");
		names.add("Anand");
		names.add("Aish");
		names.add("Ram");
		Predicate<String> p1 = s -> s.startsWith("R");
		Predicate<String> p2 = s -> s.endsWith("m");
		System.out.println("Names Start with R are:");
		checkName(p1, names);
		System.out.println("Names not Start with R are:");
		checkName(p1.negate(), names);
		System.out.println("Names Start with R and ends with m are:");
		checkName(p1.and(p2), names);
	}

	public static void checkName(Predicate<String> p, ArrayList<String> names) {
		ArrayList<String> filterList = new ArrayList<>();
		for (String name : names) {
			if (p.test(name)) {
				filterList.add(name);
			}
		}
		System.out.println(filterList);
	}
}
