package com.predicate;

public class Employee {
	String empName;
	String designation;
	double salary;
	String location;
	
	public Employee(String empName, String designation, double salary, String location) {
		super();
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
		this.location = location;
	}

	@Override
	public String toString() {
		return String.format("[%s,%s,%.2f,%s]",empName,designation,salary,location);
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		if(empName.equals(e.empName)&&designation.equals(e.designation)&&salary==e.salary && location==e.location){
			return true;
		}
		return false;
	}
}
