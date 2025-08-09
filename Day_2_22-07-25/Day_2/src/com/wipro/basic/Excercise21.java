package com.wipro.basic;

public class Excercise21 {

	public static void main(String[] args) {
		String input = "Hello World!";
        int vowels = 0;
        int consonants = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Input String: " + input);
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);
    }
}