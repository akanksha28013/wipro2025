package com.wipro.basic;

public class Excercise13 {
	
	   public static void main(String[] args) {
	        int[] arr = {10, 5, 20, 8, 15};

	        if (arr.length < 2) {
	            System.out.println("Array must contain at least two elements.");
	            return;
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("No second largest element found.");
	        } else {
	            System.out.println("Second largest element is: " + secondLargest);
	        }
	    }

}
