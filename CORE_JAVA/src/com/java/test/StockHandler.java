package com.java.test;

import java.util.ArrayList;
import java.util.Scanner;

class StockHandler {
    String name;
    String id;

    StockHandler(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class StockPerformance extends StockHandler {
    ArrayList<Integer> stockList = new ArrayList<>();
    int total;
    double average;
    String grade;

    StockPerformance(String name, String id) {
        super(name, id);
        System.out.println("\nStock Performance Profile Created");
    }

    void addStock(int qty) {
        if (qty <= 0) {
            System.out.println("Invalid stock quantity.");
        } else {
            stockList.add(qty);
            System.out.println("Stock added.");
        }
    }

    void calculateResult() {
        total = 0;
        for (int q : stockList) total += q;
        average = stockList.isEmpty() ? 0 : (double) total / stockList.size();

        if (average >= 50)
            grade = "Efficient";
        else
            grade = "Needs Improvement";
    }

    void viewSummary() {
        System.out.println("\nStock Performance Summary");
        System.out.println("Handler: " + name);
        System.out.println("Handler ID: " + id);
        System.out.println("Total Stock Handled: " + total);
        System.out.println("Average Stock Per Entry: " + average);
        System.out.println("Handling Grade: " + grade);
    }
}

class WarehouseSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Handler Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Handler ID: ");
        String id = sc.nextLine();

        StockPerformance sp = new StockPerformance(name, id);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Stock");
            System.out.println("2. Recalculate Result");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Stock Quantity: ");
                    sp.addStock(sc.nextInt());
                    break;
                case 2:
                    sp.calculateResult();
                    break;
                case 3:
                    sp.viewSummary();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    
                    sc.close();
            }
        }
    }
}
