package com.java.test;

import java.util.Scanner;

public class Swap2Nbrs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.println("Before Swap: A = " + a + ", B = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: A = " + a + ", B = " + b);
        
        sc.close();
    }
}
