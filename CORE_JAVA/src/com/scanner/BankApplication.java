package com.scanner;

public class BankApplication {

    private String customerName;
    private String customerAddress;
    private long phoneNumber;
    private double balance;

    public BankApplication(String customerName, String customerAddress,long phoneNumber, double balance) {
         this.customerName = customerName;
         this.customerAddress = customerAddress;
         this.phoneNumber = phoneNumber;
         this.balance = balance;
}

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit success, available balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw success, available balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    public void showBalance() {
        System.out.println("Balance: " + balance);
//        System.out.println("Customer: " + customerName);
//        System.out.println("Address: " +customerAddress);
//        System.out.println("Phone Number: " +phoneNumber);
    }

}
