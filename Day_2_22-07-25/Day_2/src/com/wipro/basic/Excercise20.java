package com.wipro.basic;

public class Excercise20 {

	
		    public static boolean isAnagram(String str1, String str2) {
		        // Remove spaces and convert to lowercase for fair comparison
		        str1 = str1.replaceAll("\\s", "").toLowerCase();
		        str2 = str2.replaceAll("\\s", "").toLowerCase();

		        // If lengths are different, they can't be anagrams
		        if (str1.length() != str2.length()) {
		            return false;
		        }

		        StringBuilder sb2 = new StringBuilder(str2);

		        // Check each character in str1
		        for (int i = 0; i < str1.length(); i++) {
		            char ch = str1.charAt(i);
		            int index = sb2.indexOf(String.valueOf(ch));

		            if (index != -1) {
		                sb2.deleteCharAt(index); // Remove matched character
		            } else {
		                return false; // Character not found => not an anagram
		            }
		        }

		        return sb2.length() == 0;
		    }

		    public static void main(String[] args) {
		        String word1 = "listen";
		        String word2 = "silent";

		        if (isAnagram(word1, word2)) {
		            System.out.println(word1 + " and " + word2 + " are anagrams.");
		        } else {
		            System.out.println(word1 + " and " + word2 + " are NOT anagrams.");
		        }
		    }
		}

	
