package com.wipro.exception;
public class Excercise7 {

	public static void main(String[] args) {
		String fName=null;
		try {
			String uppperCaseFName=fName.toUpperCase();
			System.out.println("UpperCase name:"+uppperCaseFName);
		}
		catch(NullPointerException e)
		{
			System.out.println("A null pointer exeception..");
		}
	}

}
