package variables;

public class Mobile {
	public static String storeName="Tech World";
	String brand;
	String price;
	
	
	public void showDetails() {
		System.out.println("Store Name :" +storeName);
		System.out.println("Mobile Brand :" +brand);
		System.out.println("Mobile Price :" +price);
		System.out.println("-------------------------");
		
	}
		
	public static void main(String[] args) {
		Mobile obj1=new Mobile();
		Mobile obj2=new Mobile();
		obj1.brand="Apple";
		obj1.price="1200";
		
		obj1.showDetails();
		
		obj2.brand="Samsung";
		obj2.price="900";
		
		obj2.showDetails();	
		
	}
	
}