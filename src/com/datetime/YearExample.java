package com.datetime;

import java.time.Year;

public class YearExample {
	public static void main(String[] args) {
		Year year = Year.of(2004);
		System.out.println(year.isLeap());
	}

}
