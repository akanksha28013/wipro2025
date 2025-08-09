package com.wipro.threadex;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadExcercise2 {
	 public static void main(String[] args) throws InterruptedException {
	      
	        List<String> names = new CopyOnWriteArrayList<>(Arrays.asList("Amit", "Jayanta"));

	        System.out.println("Original list: " + names);
	        Runnable capitalizeVowels = () -> {
	            for (int i = 0; i < names.size(); i++) {
	                String name = names.get(i);
	                if (!name.isEmpty()) {
	                    char firstChar = Character.toLowerCase(name.charAt(0));
	                    if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
	                        names.set(i, name.toUpperCase());
	                    }
	                }
	            }
	        };
	        Runnable lowercaseNonVowels = () -> {
	            for (int i = 0; i < names.size(); i++) {
	                String name = names.get(i);
	                if (!name.isEmpty()) {
	                    char firstChar = Character.toLowerCase(name.charAt(0));
	                    if (!(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u')) {
	                        names.set(i, name.toLowerCase());
	                    }
	                }
	            }
	        };
	        Thread thread1 = new Thread(capitalizeVowels);
	        Thread thread2 = new Thread(lowercaseNonVowels);

	        thread1.start();
	        thread2.start();

	        thread1.join();
	        thread2.join();

	        System.out.println("Final list: " + names);
	    }
	}