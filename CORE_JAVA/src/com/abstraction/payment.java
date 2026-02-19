package com.abstraction;

abstract class Payment {

    abstract void processPayment();
    abstract void validateTransaction();

    void generateTransactionId() {
        System.out.println("Generated transaction ID: " + (int)(Math.random()*1000000000));
    }
}
class CreditCardPayment extends Payment {
    String cardNumber, expiryDate, cvv;

    CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    void processPayment() {
        System.out.println("Processing credit card payment.");
    }

    void validateTransaction() {
        System.out.println("Validating card number, expiry, and CVV.");
    }
}

class UPIPayment extends Payment {
    String upiId, phoneNumber;

    UPIPayment(String upiId, String phoneNumber) {
        this.upiId = upiId;
        this.phoneNumber = phoneNumber;
    }

    void processPayment() {
        System.out.println("Processing UPI payment.");
    }

    void validateTransaction() {
        System.out.println("Validating UPI ID and phone number.");
    }
}
public class payment {
    public static void main(String[] args) {
    	System.out.println("\n=== Payment Processing System ===");
        Payment credit = new CreditCardPayment("1234567890123456", "12/25", "123");
        Payment upi = new UPIPayment("user@upi", "1234567890");

        credit.validateTransaction();
        credit.processPayment();
        credit.generateTransactionId();

        upi.validateTransaction();
        upi.processPayment();
        upi.generateTransactionId();
    }

    }