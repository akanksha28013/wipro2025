package com.wipro.solid;

public class GooglePay implements Payment{

	@Override
	public void makePayment(double amount) {
		System.out.println("Paid  amount using GooglePay.");
		
	}

}
