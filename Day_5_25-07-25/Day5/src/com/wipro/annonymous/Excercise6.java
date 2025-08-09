package com.wipro.annonymous;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Excercise6 {

	public static void main(String[] args) {
		Supplier<String> tDay = () -> LocalDate.now().plusDays(1).getDayOfWeek().toString();
			
		System.out.println("Tomorrow is : "+tDay.get());
	}

}
