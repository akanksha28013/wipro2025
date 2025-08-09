package com.wipro.excercise5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise5 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Computer", "Mechanical", "Electronic", "IT", "Civil");

               List<String> sortedList = strList.stream()
                .sorted(String::compareTo)  
                .collect(Collectors.toList());  
        System.out.println(sortedList);
	}

}
