package com.wipro.basic;

public class Excercise19 {

	public static void main(String[] args) {
		 String original = "Racecar";
	        String lowerCaseOriginal = original.toLowerCase();
	        StringBuilder reversedBuilder = new StringBuilder();
	        for (int i = lowerCaseOriginal.length() - 1; i >= 0; i--) {
	            reversedBuilder.append(lowerCaseOriginal.charAt(i));
	        }
	        String reversed = reversedBuilder.toString();
	        if (lowerCaseOriginal.equals(reversed)) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }
	}

}
