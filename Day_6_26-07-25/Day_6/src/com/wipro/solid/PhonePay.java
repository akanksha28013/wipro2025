package com.wipro.solid;

public class PhonePay implements Payment{

	@Override
	public void makePayment(double amount) {
		System.out.println("Paid  amount using PhonePay.");
		
	}

}
