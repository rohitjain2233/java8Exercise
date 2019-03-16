package com.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {
	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1992, Month.AUGUST, 3);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf("your age is %d years %d months and %d days.",p.getYears()
				,p.getMonths(),p.getDays());
	}
}
