package com.wipro.solid;

public class PaymentMain {
	Payment paymentMethod;
   
	public PaymentMain(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void process(double amount) {
        paymentMethod.makePayment(amount);
    }

	public static void main(String[] args) {
		Payment googlePay = new GooglePay();
        PaymentMain processor1 = new PaymentMain(googlePay);
          Payment phonePay = new PhonePay();
        PaymentMain processor2 = new PaymentMain(phonePay);
       
        Payment paytm = new Paytm();
        PaymentMain processor3 = new PaymentMain(paytm);
        processor3.process(750);
        

	}

}
