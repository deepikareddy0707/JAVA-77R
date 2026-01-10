package com.java.test;

import java.util.*;

class SalesEmployee {
    String name;
    int id;

    SalesEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class PerformanceEmployee extends SalesEmployee {
    List<Double> sales = new ArrayList<>();
    double total, average;
    String grade;

    PerformanceEmployee(String name, int id) {
        super(name, id);
    }

    void calculatePerformance() {
        total = 0;
        for (double s : sales)
            total += s;

        average = sales.size() > 0 ? total / sales.size() : 0;

        if (average >= 15000)
            grade = "Excellent";
        else if (average >= 10000)
            grade = "Good";
        else
            grade = "Needs Improvement";

        System.out.println("Performance Profile Created");
    }

    void viewSummary() {
        System.out.println("\nPerformance Summary");
        System.out.println("Employee: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Total Sales: " + total);
        System.out.println("Average Sales: " + average);
        System.out.println("Performance Grade: " + grade);
    }
}

 class SalesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        PerformanceEmployee emp = new PerformanceEmployee(name, id);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Sales");
            System.out.println("2. Recalculate Result");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Sales Amount: ");
                    double s = sc.nextDouble();
                    if (s > 0)
                        emp.sales.add(s);
                    else
                        System.out.println("Invalid sales amount");
                    break;

                case 2:
                    emp.calculatePerformance();
                    break;

                case 3:
                    emp.viewSummary();
                    break;

                case 4:
                    return;
            }
            sc.close();
        }
    }
}
