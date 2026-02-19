package com.Arrays;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scanner.nextInt();
        if(n <= 0) {
            System.out.println("Invalid size");
            return;
        }
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int ele : arr) {
            if(ele % 2 == 0) {   
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);
        scanner.close();
    }
}
