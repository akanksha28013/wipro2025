package com.wipro.exception;

public class Excercise8 {
	
		    public static int changeCurrency(int number) throws NumberFormatException {
	        if (number == 0) {
	            throw new NumberFormatException("Invalid Number");
	        }
	        return number * 80;
	    }

	    public static void main(String[] args) {
	        int input = 0;  
	        try {
	            int result = changeCurrency(input);
	            System.out.println("Converted amount: " + result);
	        } catch (NumberFormatException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
	}
