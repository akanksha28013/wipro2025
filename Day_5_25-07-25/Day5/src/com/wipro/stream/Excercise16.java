package com.wipro.stream;

import java.util.Optional;

public class Excercise16 {

	public static void main(String[] args) {
		Optional<Integer> optionalWithValue = Optional.of(2801);
		
		optionalWithValue.ifPresent(value -> System.out.println("Value is present: " + value));
        Optional<Integer> optionalEmpty = Optional.empty();
        System.out.println("Using ifPresent with an absent value:");
        
        optionalEmpty.ifPresent(value -> System.out.println("Value is present: " + value));
        System.out.println("\nUsing orElse with a present value:");
       
        Integer resultWithValue = optionalWithValue.orElse(0); 
        System.out.println("Result with value: " + resultWithValue);

        System.out.println("\nUsing orElse with an absent value:");
        Integer resultWithAbsent = optionalEmpty.orElse(999); 
        System.out.println("Result with absent value: " + resultWithAbsent);
    }
}

