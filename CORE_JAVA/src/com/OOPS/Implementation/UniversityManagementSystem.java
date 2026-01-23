package com.OOPS.Implementation;

abstract class Employee {

    // Encapsulated fields
    private String employeeId;
    private String name;

    // Constructor
    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    // Getters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // Protected helper method
    protected void printBasicInfo() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
    }

    // Abstract methods
    public abstract double calculateSalary();
    public abstract void displayDetails();
}

class FacultyMember extends Employee {

    private int departmentCode;
    private int yearsOfService;

    // Constructor
    public FacultyMember(String employeeId, String name,
                         int departmentCode, int yearsOfService) {
        super(employeeId, name);
        this.departmentCode = departmentCode;
        this.yearsOfService = yearsOfService;
    }

    // Getters
    public int getDepartmentCode() {
        return departmentCode;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    // Override salary calculation
    @Override
    public double calculateSalary() {
        double baseSalary = 50000;
        double bonus = yearsOfService * 1000;
        return baseSalary + bonus;
    }

    // Override display details
    @Override
    public void displayDetails() {
        System.out.println("Employee Details:");
        printBasicInfo();
        System.out.println("Department Code: " + departmentCode);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.printf("Monthly Salary: $%.2f%n", calculateSalary());
        System.out.println();
    }
}

class StaffMember extends Employee {

    private String designation;
    private double overtimeHours;

    // Constructor
    public StaffMember(String employeeId, String name,
                       String designation, double overtimeHours) {
        super(employeeId, name);
        this.designation = designation;
        this.overtimeHours = overtimeHours;
    }

    // Getters
    public String getDesignation() {
        return designation;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

   
    public double calculateSalary() {
        double baseSalary = 40000;
        double overtimePay = overtimeHours * 25;
        return baseSalary + overtimePay;
    }

    // Override display details
    @Override
    public void displayDetails() {
        System.out.println("Employee Details:");
        printBasicInfo();
        System.out.println("Designation: " + designation);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.printf("Monthly Salary: $%.2f%n", calculateSalary());
        System.out.println();
    }
}

public class UniversityManagementSystem {

    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        employees[0] = new FacultyMember("F001", "John Smith", 101, 5);
        employees[1] = new StaffMember("S001", "Jane Doe", "Administrator", 20);

        // Loop through employees
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
