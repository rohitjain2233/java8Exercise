package com.predicate;

public class SoftwareEngineer {
	String name;
	int age;
	boolean hasGF;
	public SoftwareEngineer(String name, int age, boolean hasGF) {
		super();
		this.name = name;
		this.age = age;
		this.hasGF = hasGF;
	}
	@Override
	public String toString() {
		return name;
	}
}
