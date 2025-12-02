package loops;

public class reverseNbr {

	public static void main(String[] args) {
		int num=721;
		int rev=0;
		while(num!=0){
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);

	}

}
