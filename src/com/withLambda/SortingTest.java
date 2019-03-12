package com.withLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(4);
		list.add(67);
		list.add(45);
		list.add(8);
		// Comparator<Integer> c = (I1, I2) -> I1 > I2 ? -1 : I1 < I2 ? +1 : 0;
		// Collections.sort(list, c);
		Collections.sort(list, (I1, I2) -> I1 > I2 ? -1 : I1 < I2 ? +1 : 0);
		System.out.println("sorted list: " + list);

		// TreeSet sorting

		TreeSet<Integer> set = new TreeSet<>(); // no constructor argument so
												// default sorting
		set.add(1);
		set.add(0);
		set.add(25);
		set.add(12);
		System.out.println("Default sorted set: " + set);
		TreeSet<Integer> set1 = new TreeSet<>((I1, I2) -> I1 > I2 ? -1 : I1 < I2 ? +1 : 0);
		set1.add(1);
		set1.add(0);
		set1.add(25);
		set1.add(12);
		System.out.println("Own sorted set: " + set1);

		// TreeMap sorting
		TreeMap<Integer, String> map = new TreeMap<>(); // no constructor
														// argument so default
														// sorting
		map.put(100, "King");
		map.put(600, "Khan");
		map.put(50, "Raja");
		map.put(200, "Ravi");
		System.out.println("Default sorted map: " + map);
		TreeMap<Integer, String> map1 = new TreeMap<>((I1, I2) -> I1 > I2 ? -1 : I1 < I2 ? +1 : 0);
		map1.put(100, "King");
		map1.put(600, "Khan");
		map1.put(50, "Raja");
		map1.put(200, "Ravi");
		System.out.println("Own sorted map: " + map1);
	}

}
