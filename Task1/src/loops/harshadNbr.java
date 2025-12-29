package loops;

public class harshadNbr {
	
	public static boolean isHarshad(int num) {
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		return (temp%sum==0);
	}

	public static void main(String[] args) {
		System.out.println(isHarshad(24)?"Harshad Number":"! Harshad Number;");
		
	}

}
