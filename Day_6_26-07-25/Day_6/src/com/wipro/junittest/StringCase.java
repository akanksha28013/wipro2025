package com.wipro.junittest;

public class StringCase {
	public static boolean isUpperCase(String input) {
        if (input == null) {
            return false;
        }
        return input.equals(input.toUpperCase());
    }

}
