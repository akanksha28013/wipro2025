package com.wipro.basic;

public class Excercise11 {
	
	public static void main(String[] args) {
      
        int[] numbers = {3, 7, 1, 9, 4};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        System.out.println("Modified array values:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

}
