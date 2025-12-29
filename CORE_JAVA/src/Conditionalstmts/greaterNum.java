package Conditionalstmts;

public class greaterNum {
	
	public int findGreater(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}
		if(num1 < num2) {
			return num2;
		}
		if(num1==num2) {
			return num1;
		}
		return num1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greaterNum obj=new greaterNum();
		System.out.println("Greater number (10,25): " + obj.findGreater(10,25));
		

	}

}
