package com.bank.app;

import com.bank.accounts.BankAccount;
import com.bank.customers.Customer;

public class BankApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.setAccountNumber("SBIN123456789");
        account.setBalance(85000.50);

        Customer customer = new Customer();
        customer.setCustomerName("Amit Verma");
        customer.setCustomerId(1001);

        account.showAccountDetails();
        System.out.println();
        customer.showCustomerDetails();
    }
}