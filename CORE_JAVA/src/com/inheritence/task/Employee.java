package com.inheritence.task;

public class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateAnnualSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double bonus;
    int numberOfEmployeesManaged;

    Manager(String name, double baseSalary, double bonus, int count) {
        super(name, baseSalary);
        this.bonus = bonus;
        this.numberOfEmployeesManaged = count;
    }

    double calculateManagerSalary() {
        return baseSalary + bonus;
    }

    double calculateAnnualSalary() {
        return calculateManagerSalary();
    }
}

class Engineer extends Employee {
    int projectCount;

    Engineer(String name, double baseSalary, int projectCount) {
        super(name, baseSalary);
        this.projectCount = projectCount;
    }

    double calculateEngineerSalary() {
        return baseSalary + (projectCount * 1000);
    }

    
    double calculateAnnualSalary() {
        return calculateEngineerSalary();
    }
}

class Salesperson extends Employee {
    double commissionRate;
    double totalSales;

    Salesperson(String name, double baseSalary, double commissionRate, double totalSales) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }

    double calculateSalespersonSalary() {
        return baseSalary + (commissionRate * totalSales);
    }

    
    double calculateAnnualSalary() {
        return calculateSalespersonSalary();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 50000, 10000, 5);
        System.out.println(manager.calculateAnnualSalary());
        System.out.println(((Manager) manager).calculateManagerSalary());

        Employee engineer = new Engineer("Bob", 70000, 5);
        System.out.println(engineer.calculateAnnualSalary());
        System.out.println(((Engineer) engineer).calculateEngineerSalary());

        Employee salesperson = new Salesperson("Charlie", 40000, 0.1, 200000);
        System.out.println(salesperson.calculateAnnualSalary());
        System.out.println(((Salesperson) salesperson).calculateSalespersonSalary());
    }
}
