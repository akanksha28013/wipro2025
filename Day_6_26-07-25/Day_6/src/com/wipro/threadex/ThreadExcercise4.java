package com.wipro.threadex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExcercise4 {

	public static void main(String[] args) {
        
	
		ExecutorService ex= Executors.newFixedThreadPool(5);
		for (int i = 1; i <= 5; i++) {
            int taskId = i;
            ex.submit(() -> {
                for (int j = 1; j <= 10; j++) {
                    System.out.println("Task " + taskId + " - Number: " + j);
                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        
                    }
                }
            });
        }
	}

}
