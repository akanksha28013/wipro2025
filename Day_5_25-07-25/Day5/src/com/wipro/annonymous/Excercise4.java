package com.wipro.annonymous;

import java.util.function.Predicate;

public class Excercise4 {

	public static void main(String[] args) {
		Predicate<String> isPalindrome = str -> {
			
			return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
		};
		
		System.out.println(isPalindrome.test("Madam"));
		System.out.println(isPalindrome.test("Hello"));
	}

}
