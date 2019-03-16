package com.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryIncrement {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Sunny",1000));
		empList.add(new Employee("Bunny",2000)); 
		empList.add(new Employee("Chinny",3000)); 
		empList.add(new Employee("Pinny",4000));
		empList.add(new Employee("Vinny",5000));
		
		System.out.println("Employee list: "+empList);
		Predicate<Employee> p = e ->e.salary < 3000;
		
		Function<Employee, Employee> f = e -> {
			e.salary = (e.salary + (e.salary * 18) / 100);
			return e;
		};
		
		ArrayList<Employee> empList2 = new ArrayList<>();
		for (Employee employee : empList) {
			if(p.test(employee)){
				empList2.add(f.apply(employee));
			}
		}
		System.out.println("Employee list after increment: "+empList);
		System.out.println("Incremented Employee List: "+empList2);
	}

}
