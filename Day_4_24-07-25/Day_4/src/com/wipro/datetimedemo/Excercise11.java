package com.wipro.datetimedemo;

import java.time.LocalDate;
import java.time.Period;

public class Excercise11 {

	public static void main(String[] args) {
		LocalDate dt1 = LocalDate.of(20001, 9, 28);
		System.out.println(getAge(dt1));
	}

	public static int getAge(LocalDate dt1) {
		LocalDate today = LocalDate.now();
		Period period = Period.between(dt1, today);
		return period.getYears();
	}

}
