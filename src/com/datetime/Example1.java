package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example1 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Date is: "+date);
		int dd = date.getDayOfMonth();
		int mm= date.getMonthValue();
		int yyyy= date.getYear();
		System.out.print("Date in dd-mm-yyyy format: ");
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		
		System.out.println();
		LocalTime time =LocalTime.now();
		System.out.println();
		System.out.println("Time is: "+time);
		int hour = time.getHour();
		int minute = time.getMinute();
		int seconds = time.getSecond();
		int nano = time.getNano();
		System.out.printf("%d:%d:%d:%d",hour,minute,seconds,nano);
		System.out.println();
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.printf("%d-%d-%d %d:%d:%d",dt.getDayOfMonth(),dt.getMonthValue()
				,dt.getYear(),dt.getHour(),dt.getMinute(),dt.getSecond());
		System.out.println();
		System.out.println("After six months : "+dt.plusMonths(6));
		System.out.println("Before six months : "+dt.minusMonths(6));
		
	}

}
