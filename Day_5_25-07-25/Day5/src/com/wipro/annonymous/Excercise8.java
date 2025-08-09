package com.wipro.annonymous;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Consumer;

public class Excercise8 {
	public static void main(String[] args) {
		Consumer<String> printTime = zone ->
			
			System.out.println(ZonedDateTime.now(ZoneId.of(zone)).toLocalTime());
			
		printTime.accept("Europe/London");
	}
}
