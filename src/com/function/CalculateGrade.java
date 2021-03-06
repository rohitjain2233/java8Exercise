package com.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class CalculateGrade {
	public static void main(String[] args) {
		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A[Dictinction]";
			} else if (marks >= 60) {
				return "B[First Class]";
			} else if (marks >= 50) {
				return "C[Second Class]";
			} else if (marks >= 40) {
				return "D[Third Class]";
			} else {
				return "F[Fail]";
			}
		};
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(new Student("Sunny", 100));
		l.add(new Student("Bunny", 65));
		l.add(new Student("Chinny", 69));
		l.add(new Student("Vinny", 45));
		l.add(new Student("Pinny", 25));

		Predicate<Student> p = s -> s.marks > 65;
		for (Student student : l) {
			if (p.test(student)) {
				System.out.println("Student Name:" + student.name);
				System.out.println("Student Marks:" + student.marks);
				System.out.println(f.apply(student));
				System.out.println();
			}
		}
	}
}
