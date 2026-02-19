package com.Arrays;

import java.util.Scanner;

public interface utilitiesArrays {
	public static int[] getArray() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size");
		int size=scanner.nextInt();
		if(size<=0 || size>10) {
			return null;
		}
		else {
			int[] arr=new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("enter"+i+"index value");
				arr[i]=scanner.nextInt();
				
			}
			return arr;
		}
		
	}

}
