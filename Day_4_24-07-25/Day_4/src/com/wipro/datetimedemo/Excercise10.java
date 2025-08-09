package com.wipro.datetimedemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Excercise10 {

	public static void main(String[] args) {
		LocalDate dtm= LocalDate.of(2023,11,1);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(dtm.format(formatter));
		
	}

} 
 
