package com.wipro.collectionframework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
//		Queue<String> persons = new LinkedList<>();
//		persons.offer("Akanksha");
//		persons.offer("Amit");
//		persons.offer("Vasu");
//		persons.offer("Abdul");
//		persons.offer("Jayanta");
//		System.out.println(persons);
//		persons.remove();
//		System.out.println(persons);
		
		Deque<String> persons = new LinkedList<>();
		persons.offer("Akanksha");
		persons.offer("Amit");
		persons.offer("Vasu");
		persons.offer("Abdul");
		persons.offerFirst("Jayanta");
		System.out.println(persons);
		persons.removeLast();
		System.out.println(persons);
	}

}
