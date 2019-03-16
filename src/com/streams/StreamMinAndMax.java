package com.streams;

import java.util.ArrayList;

public class StreamMinAndMax {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(4);
		list.add(67);
		list.add(45);
		list.add(8);
		
		System.out.println("List elements: ");
		//list.stream().forEach(i->System.out.println(i));
		list.stream().forEach(System.out::println);
		System.out.println();
		
		Integer min = list.stream().sorted().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Min Value: " + min);

		System.out.println();
		Integer max = list.stream().sorted().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Max value: " + max);
	}
}
