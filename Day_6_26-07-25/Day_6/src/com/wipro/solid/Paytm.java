package com.wipro.solid;

public class Paytm implements Payment{

	@Override
	public void makePayment(double amount) {
		System.out.println("Paid amount using Paytm.");
		
	}

}
