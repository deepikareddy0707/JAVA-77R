package com.company.app;

import com.company.hr.Employee;
import com.company.admin.Department;

public class CompanyApp {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId(101);
        employee.setName("Rahul Sharma");
        employee.setSalary(55000.75);

        Department department = new Department();
        department.setDeptName("Human Resources");
        department.setDeptId(10);

        employee.showEmployeeDetails();
        System.out.println();
        department.showDepartmentDetails();
    }
}
