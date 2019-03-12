package com.withoutLambda;

import java.util.Comparator;

public class EmployeeIdOwnSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpid() > o2.getEmpid() ? -1 
				: o1.getEmpid() < o2.getEmpid() ? +1 : 0;
	}

}
