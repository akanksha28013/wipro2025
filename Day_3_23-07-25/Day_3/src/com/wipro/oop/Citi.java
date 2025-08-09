package com.wipro.oop;

public class Citi implements BankOps {

	@Override
	public void deposit(double amount, String accountNumber) {
	}

	@Override
	public double getBalance(double amount, String accountNumber) {
		System.out.println("Account No:23456789");
		return 0;
	}

}
