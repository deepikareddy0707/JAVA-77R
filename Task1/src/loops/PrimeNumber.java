package loops;

public class PrimeNumber {
	
	public boolean isPrime(int num) {
		for(int i=2;i<=(int)Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeNumber obj=new PrimeNumber();
		System.out.println(obj.isPrime(10)? "Prime" : " not Prime");

	}

}
