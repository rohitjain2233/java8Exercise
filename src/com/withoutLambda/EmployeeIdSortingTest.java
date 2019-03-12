package com.withoutLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeIdSortingTest {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		Employee employee = new Employee(10, "Raj", 34567);
		Employee employee1 = new Employee(56, "Ram", 67854);
		Employee employee2 = new Employee(7, "Raja", 12345);
		emp.add(employee);emp.add(employee1);emp.add(employee2);
		System.out.println("Before sort:");
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i));
		}
		Comparator<Employee> c = new EmployeeIdOwnSorting();
		System.out.println("After empid sort:");
		Collections.sort(emp,c);
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i));
		}
	}

}
