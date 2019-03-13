package com.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManagementPredicate {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("Durga","CEO",30000,"Hyderabad"));
		list.add(new Employee("Sunny","Manager",20000,"Hyderabad"));
		list.add(new Employee("Mallika","Manager",20000,"Bangalore"));
		list.add(new Employee("Kareena","Lead",15000,"Hyderabad"));
		list.add(new Employee("Katrina","Lead",15000,"Bangalore"));
		list.add(new Employee("Anushka","Developer",10000,"Hyderabad"));
		list.add(new Employee("Kanushka","Developer",10000,"Hyderabad"));
		list.add(new Employee("Sowmya","Developer",10000,"Bangalore"));
		list.add(new Employee("Ramya","Developer",10000,"Bangalore"));
		System.out.println(list);
		Predicate<Employee> p1 = emp -> emp.designation.equalsIgnoreCase("manager");
		System.out.println("Managers Information:");
		employeeFilter(p1,list);
		
		Predicate<Employee> p2 = emp -> emp.location.equalsIgnoreCase("bangalore");
		System.out.println("Bangalore Employees Information:");
		employeeFilter(p2,list);
		
		Predicate<Employee> p3 = emp -> emp.location.equalsIgnoreCase("hyderabad");
		System.out.println("Hyderabad Employees Information:");
		employeeFilter(p3,list);
		
		Predicate<Employee> p4 = emp -> emp.salary < 20000;
		System.out.println("Employees whose slaray <20000 To Give Increment:");
		employeeFilter(p4,list);
		
		System.out.println("All Managers from Bangalore city for Pink Slip:");
		employeeFilter(p1.and(p2),list);
		
		System.out.println("Employees Information who are either Managers or salary <20000");
		employeeFilter(p1.or(p4), list);
		
		System.out.println("All Employees Information who are not managers:");
		employeeFilter(p1.negate(), list);
		
		Predicate<Employee> isCEO=Predicate.isEqual(new Employee("Durga","CEO",30000,"Hyderabad"));
		Employee e1=new Employee("Durga","CEO",30000,"Hyderabad");
		Employee e2=new Employee("Sunny","Manager",20000,"Hyderabad");
		System.out.println(isCEO.test(e1));//true
		System.out.println(isCEO.test(e2));//false
	}
	public static void employeeFilter(Predicate<Employee> p, ArrayList<Employee> list){
		for (Employee emp : list) {
			if(p.test(emp)){
				System.out.println(emp);
			}
		}
		System.out.println("**************************************************");
	}
}
