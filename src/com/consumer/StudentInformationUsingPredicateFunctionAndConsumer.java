package com.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.consumer.Student;

//Print the student information with grade if he gets more than 60 marks.
public class StudentInformationUsingPredicateFunctionAndConsumer {
	public static void main(String[] args) {
		ArrayList<Student> l = new ArrayList<>();
		l.add(new Student("Sunny",100));
		l.add(new Student("Bunny",65));
		l.add(new Student("Chinny",55));
		l.add(new Student("Vinny",75));
		l.add(new Student("Pinny",25));
		
		Predicate<Student> p = s -> s.marks > 60;
		
		Function<Student, String> f = s -> {
			int marks = s.marks;
			if(marks>=80){
				return "A[Dictinction]";
			}else if(marks>=60){
				return "B[First Class]";
			}else if(marks>=50){
				return "C[Second Class]";
			}else if(marks>=40){
				return "D[Third Class]";
			}else{
				return "F[Fail]";
			}
		};
		
		Consumer<Student> c = s ->{
			System.out.println("Student Name: "+s.name);
			System.out.println("Student Marks: "+s.marks);
			System.out.println("Student Grade: "+f.apply(s));
			System.out.println();
		};
		
		for (Student student : l) {
			if(p.test(student)){
				c.accept(student);
			}
		}
	}
}
