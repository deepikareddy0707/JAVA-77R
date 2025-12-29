package Conditionalstmts;

public class EvenOdd {
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {	
		EvenOdd obj=new EvenOdd();
		System.out.println("Is 10 even? " + obj.isEven(10));
		
		

	}

}
