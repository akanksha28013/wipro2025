package com.wipro.oop;

public class HDFC implements BankOps {

	@Override
	public void deposit(double amount, String accountNumber) {
		System.out.println("Amount is :20000");
	}

	@Override
	public double getBalance(double amount, String accountNumber) {
		System.out.println("Account Balance is:25000");
		
		return 0;
	}

}
