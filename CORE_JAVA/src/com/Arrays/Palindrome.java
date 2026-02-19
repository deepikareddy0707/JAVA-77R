package com.Arrays;

public class Palindrome {
	public static boolean isPalindrome(int num) {
		int temp=num;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rem*10+rev;
			num/=10;
		}
		return temp==rev;
	}

	public static void main(String[] args) {
		int[] arr=utilitiesArrays.getArray();
		for(int ele:arr) {
			if(isPalindrome(ele)) {
			System.out.println(ele);
		}
		}

	}

}
