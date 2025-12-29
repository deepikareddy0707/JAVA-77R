package loops;


public class amstrongNbr {
	
	public int getPower(int base, int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
		}
		return power;
	}
	public int getPowerofNbr(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
		
	}
	
	public boolean isArmstrong(int num) {
	 int count= getPowerofNbr(num);
	 int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum+=getPower(rem,count);
			num/=10;
			
		}
		return temp==sum;

	}
	
	public static void main(String[] args) {
		boolean result=new amstrongNbr().isArmstrong(153);
		System.out.println(result?"Armstrong":"!Armstrong");
	}

}
