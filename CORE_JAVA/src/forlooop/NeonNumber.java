package forlooop;

public class NeonNumber {

	public static void main(String[] args) {

		
		int number=9;
		int square=number*number; 
		int temp=number; 
		int sum=0; 
		while(square!=0) {
			int rem=square%10; 
			sum=sum+rem; 
			square/=10; 
		}
		if(temp==sum) {  
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not a Neon Number");
		}

	}

}
