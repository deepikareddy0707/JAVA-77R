package loops;

import java.util.Scanner;

public class checkDigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		String s=scanner.nextLine();
		int first=s.charAt(0)-'0';
		int last=s.charAt(s.length()-1)-'0';
		boolean result=true;
		scanner.close();
		for(int i=1;i<s.length()-1;i++) {
			int mid=s.charAt(i)-'0';
			if(mid>=first || mid>=last) {
				result=false;
				break;
			}
		}
		System.out.println(result);

	}

}
