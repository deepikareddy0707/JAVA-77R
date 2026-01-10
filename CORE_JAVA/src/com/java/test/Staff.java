package com.java.test;

import java.util.Scanner;

public class Staff {
	
	private String staffName;
	private String staffID;
	private String baseShift;
	
	public Staff(String staffName, String staffID, String baseShift) {
		this.staffName=staffName;
		this.staffID=staffID;
		this.baseShift=baseShift;
	}
	
	 class DepartmentStaff extends Staff{
		
		private String departmentName;
		private String responsibilityLevel;

		public DepartmentStaff(String staffName, String staffID, String baseShift,String departmentName, String responsibilityLevel) {
			super(staffName, staffID, baseShift);
			
			this.departmentName=departmentName;
			this.responsibilityLevel=responsibilityLevel;
		}
	
	public void UpdateResponsibility(String role) {
		if((role==null)||(role.isEmpty())){
			System.out.println("Invalid Responsibility Update");
		}
		else {
			this.responsibilityLevel=role;
			System.out.println("Responsibility Updated");
		}
	}
	
	public void UpdateDepartment(String name) {
		if((name==null)||(name.isEmpty())) {
			System.out.println("Invalid Department Name");
		}
		else {
			this.departmentName=name;
			System.out.println("Department name Updated");
		}
	}
	public void ViewProfile() {
		System.out.println("\n Staff Details: ");
		System.out.println("Staff Name: " +staffName);
		System.out.println("Staff ID: " +staffID);
		System.out.println("Shift: " +baseShift);
		System.out.println("Department Name: " +departmentName);
		System.out.println("Responsibilty Level: " +responsibilityLevel);	
	}
	}
	
	public static class HotelStaff{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Staff Name: ");
			String name=sc.nextLine();
			System.out.println("Enter Staff ID: ");
			String iD=sc.next();
			System.out.println("Enter Base Shift: ");
			String shift=sc.next();
			System.out.println("Enter Department Name: ");
			String dept=sc.nextLine();
			System.out.println("Enter Responsibility Level: ");
			String res=sc.next();
			
			
			Staff outer = new Staff(name, iD, shift);
			Staff.DepartmentStaff staff = outer.new DepartmentStaff(name, iD, shift, dept, res);


				while(true) {
					System.out.println("---------Menu-----------");
					System.out.println("1. Update Responsibility");
					System.out.println("2. Update Department");
					System.out.println("3. View Profile");
					System.out.println("4. Exit");
					
					int choice=sc.nextInt();
					sc.nextLine(); 
					switch (choice) {
					case 1: {
						System.out.println("Enter new Responsibility: ");
						staff.UpdateResponsibility(sc.next());
						break;	
					}
					case 2: {
						System.out.println("Enter new Department: ");
						staff.UpdateDepartment(sc.nextLine());
						break;
					}
					case 3:{
						staff.ViewProfile();
						break;
					}
					case 4:{
						System.out.println("Exit");
						return;
					}
					default:
						System.out.println("Invalid Data");
					

		}
					sc.close();

	}

}
	}
}
