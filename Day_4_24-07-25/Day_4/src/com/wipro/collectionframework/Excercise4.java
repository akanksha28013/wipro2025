package com.wipro.collectionframework;

import java.util.HashSet;
import java.util.Set;

public class Excercise4 {

	public static void main(String[] args) {
		Set<Integer> set1= new HashSet<>();
		set1.add(1);
		set1.add(4);
		set1.add(5);
		set1.add(11);
		
		Set<Integer> set2= new HashSet<>();
		set2.add(10);
		set2.add(54);
		set2.add(5);
		set2.add(11);
		
		System.out.println("Set1: "+set1);
		System.out.println("Set2: "+set2);
		
	}

}
