package com.streams;

import java.util.ArrayList;

public class StreamToArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(4);
		list.add(67);
		list.add(45);
		list.add(8);

		Integer[] array = list.stream().toArray(Integer[]::new);
		for (Integer integer : array) {
			System.out.println(integer);
		}
	}
}
