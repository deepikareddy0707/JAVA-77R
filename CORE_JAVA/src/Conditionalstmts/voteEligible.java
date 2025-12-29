package Conditionalstmts;

public class voteEligible {

	public boolean canVote(int age) {
		if(age>=18) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {	
		voteEligible obj=new voteEligible();
		System.out.println("Can vote (Age 20)? " + obj.canVote(20));
		

	}

}