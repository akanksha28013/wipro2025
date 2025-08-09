package com.wipro.annonymoustest;

import com.wipro.annonymous.Multiply;

public class MultiplyTest {

	public static void main(String[] args) {
		Multiply mul = (a,b) -> a*b;
		System.out.println("Multiplication:"+mul.multiply(23,6));
	}

}
