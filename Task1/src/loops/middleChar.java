package loops;

import java.util.*;

public class middleChar {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string or number:");
		String s=scanner.nextLine();
		int len=s.length();
		scanner.close();
		
		if(len%2==0){
			System.out.println(s.substring(len/2 - 1, len/2 + 1));
		}
		else {
			System.out.println(s.charAt(len/2));
		}

	}

}
