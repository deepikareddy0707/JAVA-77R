package Conditionalstmts;

public class positiveNegative {
	
	public String checkNumber(int num) {
		if(num >0) {
			return "Positive";
		}
		if(num<0) {
			return "Negative";
		}
		if(num==0) {
		return "Zero";
	}
		return "";
	}

	public static void main(String[] args) {	
		positiveNegative obj=new positiveNegative();
		System.out.println("Check -5: " + obj.checkNumber(-5));
		System.out.println("Check 0: " + obj.checkNumber(0));

		
		

	}

}
