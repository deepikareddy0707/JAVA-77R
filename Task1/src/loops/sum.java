package loops;

import java.util.Scanner;


public class sum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		String n=scanner.nextLine();
		int sum1=(n.charAt(0)-'0')+(n.charAt(n.length()-1)-'0');
		int sum2=0;
		scanner.close();
		for(int i=1;i<n.length()-1;i++) {
			sum2+=n.charAt(i)-'0';
		}
		if(sum1==sum2) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		

	}

}
