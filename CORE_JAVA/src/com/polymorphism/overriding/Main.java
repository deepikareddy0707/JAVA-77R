package com.polymorphism.overriding;

class Payment{
	Double amount;
	Integer transactionLimit;
	
	public Payment(Double amount, Integer transactionLimit) {
		this.amount=amount;
		this.transactionLimit=transactionLimit;
	}
	void processPayment(Double paymentAmount) {
		System.out.println("Processing payment amount" +paymentAmount);
	}
	
}

class CreditCardPayment extends Payment{
	public CreditCardPayment(Double amount, Integer transcationLimit) {
		super(amount, transcationLimit);
	}

void processPayment(Double paymentAmount) {
	if(paymentAmount<=transactionLimit) {
		System.out.println("Credit Card Payment Successful: " +paymentAmount);		
	}
	else {
		System.out.println("Credit Card Payment Failed: Credit limit exceeded");
	}
}
}

class DebitCardPayment extends Payment{
	public DebitCardPayment(Double amount, Integer transcationLimit) {
		super(amount, transcationLimit);
	}
	void processPayment(Double paymentAmount) {
		if(paymentAmount<=amount) {
			System.out.println("Debit Card Payment Successful:" +paymentAmount);
		}
		else {
			System.out.println("Debit Card Payment Failed: Insufficient Balance");
		}
	}
}
class UPIPayment extends Payment{
	UPIPayment(Double amount,Integer transcationLimit){
		super(amount, transcationLimit);
	}
	void processPayment(Double paymentAmount) {
		if(paymentAmount<=transactionLimit) {
			System.out.println("UPI Payment Successful:" +paymentAmount);
		}
		else {
			System.out.println("UPI Payment Failed: Daily transaction limit exceeded");
		}
	}

}

public class Main {

	public static void main(String[] args) {
		Payment payment=new CreditCardPayment(0.0, 50000);
		payment.processPayment(30000.0);
		
		Payment payment1=new DebitCardPayment(20000.0, 0);
		payment1.processPayment(25000.0);
		
		Payment payment2=new UPIPayment(0.0, 10000);
		payment2.processPayment(8000.0);

	}

}
