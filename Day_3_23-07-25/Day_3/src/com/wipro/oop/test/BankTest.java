package com.wipro.oop.test;

import com.wipro.oop.Citi;
import com.wipro.oop.HDFC;

public class BankTest {

	public static void main(String[] args) {
		
		HDFC hdfc = new HDFC();
		hdfc.deposit(2000, "234567890");
		hdfc.getBalance(5678, "345678");
		
		Citi citi = new Citi();
		citi.deposit(3000, "98765432");
		citi.getBalance(5678, "345678");
	}

}
