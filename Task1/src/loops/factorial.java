package loops;

public class factorial {

	public static void main(String[] args) {
		int fact=1;
		int num=3;
		int i=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);

	}

}
