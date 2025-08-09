package com.wipro.stream;

import java.util.Arrays;
import java.util.List;

public class Excercise13 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,4,56);
		System.out.println(
				list.stream()
				.mapToInt(i->i)
				.average()
				.orElse(0)
				);
}
}


