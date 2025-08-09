package com.wipro.basic;

public class Excercise7 {

	public static void main(String[] args) {
		float num1=25.586f;
		float num2=25.589f;
		
		long n1=Math.round(num1*1000);
		long n2=Math.round(num2*1000);
		
		if(n1==n2) {
		System.out.println("They are same upto three decimal places.");
		}
		else
		{
			System.out.println("They are different");
		}
	}

}
