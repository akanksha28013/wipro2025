package com.wipro.basic;

public class Excercise14 {
	public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(arr);
        System.out.println("Length after removing duplicates: " + length);
        
        System.out.print("Resulting array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int index = 1; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }

        return index;
    }
}
