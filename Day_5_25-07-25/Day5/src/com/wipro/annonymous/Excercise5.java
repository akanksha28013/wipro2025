package com.wipro.annonymous;

import java.util.function.Predicate;

public class Excercise5 {

	public static void main(String[] args) {
		Predicate<String> isUpper = str -> str.equals(str.toUpperCase());
		
		Predicate<String> isLower = str -> str.equals(str.toLowerCase());
		
		String s1="HELLO";
		String s2="Hyello";
		
		System.out.println("is"+s1+" is Upper Case"+isUpper.test(s1));
		System.out.println("is"+s2+" is Lower Case"+isLower.test(s2));
		
	}

}
