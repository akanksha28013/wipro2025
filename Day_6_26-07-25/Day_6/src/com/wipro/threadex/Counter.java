package com.wipro.threadex;

public class Counter {
	int count = 0;
	
//	public void increment() {
//        count++;
    //}
    synchronized void synchIncrement() {
        count++;
    }

    public int getCount() {
        return count;
    }

}
