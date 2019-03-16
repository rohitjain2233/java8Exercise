package com.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerChaining {
	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie("DDLJ", 196, "Shahrukh", "Kajol","Super Hit"));
		movieList.add(new Movie("Veer Zara", 175, "Shahrukh", "Priety", "Hit"));
		movieList.add(new Movie("Ishq", 207, "Amir", "Kajol","Hit"));
		
		Consumer<Movie> c1 = m -> System.out.println(m.name+" is ready to release");
		Consumer<Movie> c2 = m -> System.out.println(m.name+" is released and it is "+m.result);
		Consumer<Movie> c3 = m -> System.out.println(m.name+" information storing in database...");
		
		for (Movie movie : movieList) {
			c1.andThen(c2).andThen(c3).accept(movie);
			System.out.println();
		}
	}

}
