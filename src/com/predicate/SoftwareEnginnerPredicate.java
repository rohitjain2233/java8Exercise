package com.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class SoftwareEnginnerPredicate {
	public static void main(String[] args) {
		Predicate<SoftwareEngineer> p = se -> se.age > 18 && se.hasGF;
		ArrayList<SoftwareEngineer> list = new ArrayList<>();
		SoftwareEngineer se = new SoftwareEngineer("Rohit", 26, true);
		SoftwareEngineer se1 = new SoftwareEngineer("Raj", 26, true);
		SoftwareEngineer se2 = new SoftwareEngineer("Rahul", 26, false);
		SoftwareEngineer se3 = new SoftwareEngineer("Shashank", 26, false);
		SoftwareEngineer se4 = new SoftwareEngineer("Kapil", 26, true);
		SoftwareEngineer se5 = new SoftwareEngineer("Rahim", 16, true);
		list.add(se);list.add(se1);list.add(se2);list.add(se3);list.add(se4);
		list.add(se5);
		ArrayList<SoftwareEngineer> filterList = new ArrayList<>();
		for (SoftwareEngineer softwareEngineer : list) {
			if(p.test(softwareEngineer)){
				filterList.add(softwareEngineer);
			}
		}
		System.out.println(filterList);
	}
}
