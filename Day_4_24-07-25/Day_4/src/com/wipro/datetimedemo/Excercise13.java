package com.wipro.datetimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Excercise13 {

	public static void main(String[] args) {
		LocalDate dt = LocalDate.of(2024,6,23);
		
		int year = dt.getYear();
		if(dt.isLeapYear())
		{
			System.out.println(year+"is leap year");
		}
		else {
			System.out.println(year+"is not leap year");
		}
		
	}

}
