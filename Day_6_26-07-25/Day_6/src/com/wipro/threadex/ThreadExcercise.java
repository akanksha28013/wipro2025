package com.wipro.threadex;

public class ThreadExcercise  extends Thread{
	
public static void main(String[] args) {
    
    NumThread t1=new  NumThread();
    t1.start();
    CharThread t2=new  CharThread();
    
    t2.start();
		}
	}
