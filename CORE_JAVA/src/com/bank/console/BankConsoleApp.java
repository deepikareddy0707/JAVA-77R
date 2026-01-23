package com.bank.console;

import java.util.Scanner;
import com.bank.customers1.CustomerName;

public class BankConsoleApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        long phone = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Type: ");
        String accountType = sc.nextLine();

        CustomerName customer = new CustomerName(name, phone, accountType);

        boolean exit = false;

        while (!exit) {

            System.out.println("""
                    
                    ===== BANK MENU =====
                    1. Activate KYC
                    2. Deposit
                    3. Withdraw
                    4. View Account Summary
                    5. Exit
                    =====================
                    """);

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> customer.activateKYC();

                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    double amount = sc.nextDouble();
                    customer.deposit(amount);
                }

                case 3 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = sc.nextDouble();
                    customer.withdraw(amount);
                }

                case 4 -> customer.viewAccountSummary();

                case 5 -> {
                    exit = true;
                    System.out.println("Thank you for using Bank Application");
                }

                default -> System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
