package com.Arrays;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of array elements = " + sum);
    }
}












































//public class sumOfArray {
//	public static int sum(int[] arr) {
//        int sum = 0;
//        for(int ele : arr) {
//            sum += ele;
//        }
//        return sum;
//    }
//
//
//	public static void main(String[] args) {
//		int[] arr=utilitiesArrays.getArray();
//		for(int ele:arr) {
//			System.out.println(ele);
//			
//		}
//		int total = sum(arr);
//        System.out.println("Sum of array = " + total);
//
//	}
//
//}


