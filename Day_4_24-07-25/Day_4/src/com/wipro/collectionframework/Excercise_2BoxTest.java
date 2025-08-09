package com.wipro.collectionframework;

public class Excercise_2BoxTest {

	public static void main(String[] args) {
		Excercise_2Box<Integer> box1 = new Excercise_2Box<>();
		box1.setItem(230);
		System.out.println(box1.getItem());
		
		Excercise_2Box<String> box2 = new Excercise_2Box<>();
		box2.setItem("Hello Java");
		System.out.println(box2.getItem());
		
		Excercise_2Box<Double> box3 = new Excercise_2Box<>();
		box3.setItem(4.3);
		System.out.println(box3.getItem());
		
	}

}
