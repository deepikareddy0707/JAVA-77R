package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=scanner.nextInt();
		if(n<=0 || n>10) {
			System.out.println("Invalid");
			scanner.close();
		}
		else {
				String[] str=new String[n];
				for(int i=0;i<n;i++) {
				System.out.println("enter"+i+ "index value");
				str[i]=scanner.next();
			}
		scanner.close();
		
		System.out.println(Arrays.toString(str));
	}
	}
}
