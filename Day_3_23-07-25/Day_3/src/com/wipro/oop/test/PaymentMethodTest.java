package com.wipro.oop.test;

import com.wipro.oop.Gpay;
import com.wipro.oop.PaymentMethod;
import com.wipro.oop.PhonePay;

public class PaymentMethodTest {

	public static void main(String[] args) {
		PaymentMethod payment1 = new Gpay();
		payment1.pay(3000.0);
		
		PaymentMethod payment2 = new PhonePay();
		payment2.pay(4000.0);
	}
}
