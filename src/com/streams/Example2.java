package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		System.out.println("Numbers: " + list);
		System.out.println();
		List<Integer> doubleList = list.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(doubleList);
		long count = list.stream().map(i -> i * 2).count();
		System.out.println(count+" numbers are in the list");
	}

}
