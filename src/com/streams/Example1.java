package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		System.out.println("Numbers: " + list);

		// Without Streams
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();

		for (Integer integer : list) {
			if (integer % 2 == 0) {
				evenList.add(integer);
			} else {
				oddList.add(integer);
			}
		}
		System.out.println("Even numbers: " + evenList);
		System.out.println("Odd numbers: " + oddList);
		System.out.println();
		System.out.println("Using Streams: ");

		List<Integer> even = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> odd = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println("Even numbers: " + even);
		System.out.println("Odd numbers: " + odd);

	}

}
