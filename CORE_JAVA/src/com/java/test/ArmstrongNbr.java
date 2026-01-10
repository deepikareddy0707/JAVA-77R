package com.java.test;

import java.util.Scanner;

public class ArmstrongNbr {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=scanner.nextInt();
		int temp=n;
		int sum=0;
		
		while(temp!=0) {
			int digit=temp%10;
			sum+=digit*digit*digit;
			temp/=10;
			
		}
		if(sum==n) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");

		}
		scanner.close();

	}

}
