package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter the size");
int n=scanner.nextInt();
int []arr=new int[n];
//System.out.println(Arrays.toString(arr));
for(int i=0;i<n;i++) {
	System.out.println("enter"+i+"index value");
	int ele=scanner.nextInt();
	arr[i]=ele;
}
System.out.println(Arrays.toString(arr));

scanner.close();
}

}
