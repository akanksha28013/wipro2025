package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Excerxise12 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jayanta", "Jnanedra", "Raja", "Anjali", "Jaya");
        List<String> filteredNames = names.stream()
                .filter(name -> name.toLowerCase().contains("ja"))
                .collect(Collectors.toList());
        names.forEach(name -> {
        	if(filteredNames.contains(name)) {
        		System.out.println(name + " -> This will pass");
        	}else {
        		System.out.println(name + " -> This will not pass");
        	}
        });;
       
	}

}
