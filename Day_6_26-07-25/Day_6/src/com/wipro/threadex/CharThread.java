package com.wipro.threadex;

public class CharThread extends Thread{

	public void run()
	{
		for (char c = 'A'; c <= 'J'; c++)
		{
            System.out.println("Thread Character : "+c);
        }
    }

}
