package com.wipro.oop;

public class Gpay implements PaymentMethod{

	@Override
	public void pay(double amount) {
		System.out.println("The GPay amount : "+amount);
		
	}

}
