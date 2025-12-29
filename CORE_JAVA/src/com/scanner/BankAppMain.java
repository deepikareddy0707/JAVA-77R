package com.scanner;

import java.util.Scanner;

public class BankAppMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your phoneNumber: ");
        long phoneNumber = sc.nextLong();

        System.out.print("Enter your initial deposit balance: ");
        double balance = sc.nextDouble();
        
        BankApplication bank = new BankApplication(name, address, phoneNumber, balance);

        int option;

        do {
            System.out.println("\n*Select Options from below*");
            System.out.println("1. withdraw");
            System.out.println("2. deposit");
            System.out.println("3. showBalance");
            System.out.println("4. exit");

            System.out.print("Enter your option [1-4]: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter withdraw money: ");
                    bank.withdraw(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter deposit money: ");
                    bank.deposit(sc.nextDouble());
                    break;

                case 3:
                    bank.showBalance();
                    break;

                case 4:
                    System.out.println("Thank you !");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (option != 4);

        sc.close();
    }
}
