package com.abstraction;

abstract class Employee {
    String name, id;

    Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();

    void applyLeave() {
        System.out.println("Leave applied successfully.");
    }

    void getDetails() {
        System.out.println("Employee Details: " + name + ", ID: " + id);
    }
}
class FullTimeEmployee extends Employee {
    double basePay, benefits;

    FullTimeEmployee(String name, String id, double basePay, double benefits) {
        super(name, id);
        this.basePay = basePay;
        this.benefits = benefits;
    }

    void calculateSalary() {
        System.out.println("Calculating salary: Base pay + benefits = $" + (basePay + benefits));
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, String id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary() {
        System.out.println("Calculating salary: Hours × rate = $" + (hourlyRate * hoursWorked));
    }
}
public class employee {
    public static void main(String[] args) {
System.out.println("\n=== Employee Payroll System ===");
Employee fullTime = new FullTimeEmployee("John Doe", "12345", 50000, 10000);
Employee partTime = new PartTimeEmployee("Jane Smith", "67890", 20, 15);

fullTime.getDetails();
fullTime.calculateSalary();
fullTime.applyLeave();

partTime.getDetails();
partTime.calculateSalary();
partTime.applyLeave();
}
}