package com.wipro.annonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Excercise10 {

	public static void main(String[] args) {
		
		Function<List<String>,List<Integer>> getLengths =list -> {
			List<Integer> result = new ArrayList<>();
			for(String s:list)
			{
				result.add(s.length());
			}
			return result;

		};
		List<String> names= Arrays.asList("Jayanta","Amit","Vasu");
		System.out.println(getLengths.apply(names));
	}

}
