package com.wipro.basic;

public class Excercise6 {

	public static void main(String[] args) {
		float num=25;
		if(num==0)
		{
			System.out.println("Zero");
		}
		else if(num>0)
		{
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
		double absNum=Math.abs(num);
		if(absNum<1)
		{
			System.out.println("Small");
		}
		else if(absNum>1000000)
		{
			System.out.println("Large");
		}
		
		
	}

}
