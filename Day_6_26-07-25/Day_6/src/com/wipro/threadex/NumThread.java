package com.wipro.threadex;

public class NumThread extends Thread {
	public void run()
	{
		for (int i=1;i<10;i++)
		{
                     System.out.println("Thread Number : "+i);
        }
    }

}
