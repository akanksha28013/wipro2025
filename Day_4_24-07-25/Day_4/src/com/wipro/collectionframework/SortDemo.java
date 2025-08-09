package com.wipro.collectionframework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(1,4,67,89,2);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
