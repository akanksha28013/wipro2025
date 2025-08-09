package com.wipro.annonymoustest;

import com.wipro.annonymous.BankOps;

public class BankOpsTest {

	public static void main(String[] args) {
		BankOps savingAccount = new BankOps() {
		
		@Override
		public void deposit(double amount)
		{
			System.out.println("Saving Account: "+amount);
		}
		};
		savingAccount.deposit(20000.0);
		
		BankOps currentAccount = new BankOps() {
			
			@Override
			public void deposit(double amount)
			{
				System.out.println("Current Account:"+amount);
			}
			};
			savingAccount.deposit(78000.0);

		
		
	}

}
