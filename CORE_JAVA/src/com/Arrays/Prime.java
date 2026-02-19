package com.Arrays;

//import java.security.PublicKey;

public class Prime {
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		else {
			for(int i=2;i*i<=num;i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		int[] arr=utilitiesArrays.getArray();
		for(int ele:arr) {
			if(isPrime(ele)) {
				System.out.println(ele);
			}
		}

	}

}
