package Conditionalstmts;

public class divisibleBy5 {
	
	public boolean isDivisibleBy5(int num) {
		if (num%5==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		divisibleBy5 obj=new divisibleBy5();
		System.out.println("Is 15 divisible by 5? " + obj.isDivisibleBy5(15));
		

	}

}
