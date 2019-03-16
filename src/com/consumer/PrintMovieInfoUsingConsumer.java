package com.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class PrintMovieInfoUsingConsumer {
	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie("DDLJ", 196, "Shahrukh", "Kajol","Super Hit"));
		movieList.add(new Movie("Veer Zara", 175, "Shahrukh", "Priety", "Hit"));
		movieList.add(new Movie("Ishq", 207, "Amir", "Kajol","Hit"));
		
		Consumer<Movie> c = m -> {
			System.out.println("Movie Name: "+m.name);
			System.out.println("Movie Duration: "+m.duration+" Minutes");
			System.out.println("Hero: "+m.hero);
			System.out.println("Heroin: "+m.heroin);
			System.out.println();
		};
		int count =1;
		for (Movie movie : movieList) {
			System.out.println("Movie number "+count);
			c.accept(movie);
			count++;
		}
	}
}
