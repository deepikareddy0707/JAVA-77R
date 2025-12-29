package variables;


public class Variables {
	public static int a;
	static int b=20;
	
	public static int math1(int x,int y) {
		System.out.println(x+y);
		return math2(a+b,y-x);
	}
	public static int math2(int c,int d) {
		System.out.println(c+d);
		return math3(a+b);
	}
	
	public static int math3(int e) {
		 a=30;
		return e;
	}
public static void main(String[] args) {
	System.out.println(math1(10, 20));
	System.out.println(a);
}
}
