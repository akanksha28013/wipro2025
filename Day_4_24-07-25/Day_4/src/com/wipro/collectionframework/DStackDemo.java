package com.wipro.collectionframework;

import java.util.Stack;

public class DStackDemo {

	public static void main(String[] args) {
		Stack<String> books = new Stack<>();
		books.push("Physics");
		books.push("Maths");
		books.push("Chemistry");
		books.push("Biology");
		System.out.println(books);
		books.pop();
		System.out.println(books);
		System.out.println(books.peek());
		System.out.println(books);
		System.out.println(books.get(0));
		
	}

}
