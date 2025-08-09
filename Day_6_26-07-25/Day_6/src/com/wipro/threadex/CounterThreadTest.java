package com.wipro.threadex;

public class CounterThreadTest {

	public static void main(String[] args) {
		Counter counter = new Counter();

		CounterThread thread1 = new CounterThread(counter);
		CounterThread thread2 = new CounterThread(counter);

        thread1.start();
        thread2.start();

        try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
         

        System.out.println("Final count: " + counter.getCount());
    }
	}
