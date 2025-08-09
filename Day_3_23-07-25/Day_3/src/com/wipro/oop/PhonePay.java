package com.wipro.oop;

public class PhonePay implements PaymentMethod{

	@Override
	public void pay(double amount) {
		System.out.println("The amount paid by PhonePay is: "+amount);
	}

}
