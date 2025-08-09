package com.wipro.collectionframework;

import java.util.ArrayList;

public class Excercise3 {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(12);
		
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.add(34);
		System.out.println(list);
		
	}

}
