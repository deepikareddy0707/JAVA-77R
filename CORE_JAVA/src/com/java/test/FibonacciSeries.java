package com.java.test;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=scanner.nextInt();
		int a=0,b=1,c;
		
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		scanner.close();

	}

}
