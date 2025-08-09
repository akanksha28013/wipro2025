package com.wipro.basic;

public class Excercise22 {

	public static void main(String[] args) {
          String input = "Java is a powerful programming language";
             String[] words = input.split("\\s+");
        String shortestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }
        System.out.println("Input: " + input);
        System.out.println("Shortest word: " + shortestWord);
	}

}
