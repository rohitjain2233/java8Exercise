package com.withoutLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumberSortingTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(4);
		list.add(67);
		list.add(45);
		list.add(8);
		System.out.println("Before sort:");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After default sort:");
		System.out.println(list);
		Comparator<Integer> c = new NumberOwnSorting();
		System.out.println("After own sort:");
		Collections.sort(list,c);
		System.out.println(list);
	}

}
