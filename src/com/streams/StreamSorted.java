package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(4);
		list.add(67);
		list.add(45);
		list.add(8);

		System.out.println("List: " + list);
		System.out.println();
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending Sorted List: " + sortedList);

		System.out.println();
		List<Integer> sortedList2 = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Decending Sorted List: " + sortedList2);
	}
}
