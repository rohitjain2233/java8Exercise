package com.function;

import java.util.ArrayList;
import java.util.function.Function;

public class TotalEmployeeSalary {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Sunny",1000));
		empList.add(new Employee("Bunny",2000)); 
		empList.add(new Employee("Chinny",3000)); 
		empList.add(new Employee("Pinny",4000));
		empList.add(new Employee("Vinny",5000));
		
		Function<ArrayList<Employee>,Double> f = l -> {
			double totalSalary = 0;
			for (Employee employee : l) {
				totalSalary = totalSalary + employee.salary;
			}
			return totalSalary;
		};
		System.out.println("Total salary for this month: "+f.apply(empList));
	}
}
