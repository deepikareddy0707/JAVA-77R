package com.multithreading;

class BankAccount {
    private int balance = 5000;

    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " depositing: " + amount);
        balance += amount;
        System.out.println("Updated Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " withdrawing: " + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Insufficient balance! Current Balance: " + balance);
        }
    }
}

class CustomerThread extends Thread {
    private BankAccount account;

    public CustomerThread(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    public void run() {
        account.deposit(1000);
        account.withdraw(2000);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        CustomerThread t1 = new CustomerThread(account, "Customer-1");
        CustomerThread t2 = new CustomerThread(account, "Customer-2");

        t1.start();
        t2.start();
    }
}