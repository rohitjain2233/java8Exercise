package com.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class AuthenticationUsingPredicate {
	public static void main(String[] args) {
		Predicate<User> p = u -> u.getUserName().equalsIgnoreCase("Rohit") && u.getPassword().equalsIgnoreCase("123");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name: ");
		String userName = sc.next();
		System.out.println("Enter the Password: ");
		String pass = sc.next();
		User user = new User(userName, pass);
		if(p.test(user)){
			System.out.println("Logged in sucessfully");
		}
		else{
			System.out.println("User name or password is incorrect");
		}
	}
}
