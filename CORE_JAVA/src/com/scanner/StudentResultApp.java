package com.scanner;
import java.util.Scanner;

public class StudentResultApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Student ID: ");
		int id=sc.nextInt();
		System.out.print("Enter Course Name: ");
		String course=sc.next();
		System.out.print("Enter First Subject Marks: ");
		double marks=sc.nextDouble();
		
		StudentResult student=new StudentResult(name, id, course, marks);
		
		int choice;
		
		do {
			System.out.println("\n MENU OPTIONS:");
			System.out.println("1. Add more subject marks");
			System.out.println("2. Calculate grade");
			System.out.println("3. View total marks");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			
			choice=sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter marks to add: ");
				marks=sc.nextDouble();
				student.addMarks(marks);
				break;
               }
			case 2:{
				student.calculateGrade();
				break;
			}
			case 3:{
				student.viewTotalMarks();
				break;
			}
			case 4:{
				System.out.println("Thank You! Result Processing Completed");
				break;
			}
			
			default:{
				System.out.println("Invalid Option");
			}
			}
		}
			
			while(choice!=4);
		
			sc.close();
		
		}
}
