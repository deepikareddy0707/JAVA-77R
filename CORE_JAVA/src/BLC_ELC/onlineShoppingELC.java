package BLC_ELC;

public class onlineShoppingELC {

	public static void main(String[] args) {
		onlineShoppingBLC obj= new onlineShoppingBLC();
		onlineShoppingBLC obj1= new onlineShoppingBLC();
		obj.setProductId(52);
		obj.setProductName("Coffee");
		obj.setPrice(80.0d);
		obj.setQuantity(150);
		
		obj1.setProductId(124);
		obj1.setProductName("Salt");
		obj1.setPrice(60.0d);
		obj1.setQuantity(500);
		
		System.out.println(obj.displayData());
		
		System.out.println(obj1.displayData());

	}

}
