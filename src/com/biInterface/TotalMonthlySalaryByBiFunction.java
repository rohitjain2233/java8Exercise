package com.biInterface;

import java.util.function.BiFunction;

public class TotalMonthlySalaryByBiFunction {
	public static void main(String[] args) {
		Employee e = new Employee(101, "Raja", 2000);
		TimeSheet t = new TimeSheet(101, 22);
		
		BiFunction<Employee, TimeSheet, Double> f =  (emp,time) -> e.dailyWage*t.noOfdays;
		System.out.println("Total monthly salary: "+f.apply(e, t));
		
		
	}
}
