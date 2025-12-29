package _4_11_25;

public class Product {
	String productName;
	int productId;
	long productPrice;
	
	void addProductDetails(String name,int ID,long price) {
		productName=name;
		productId=ID;
		productPrice=price;
	}
	
	String displayDetails() {
		return "Product Name :" +productName+ " Product ID :" +productId+ " Product Price :" +productPrice;
	}
	

	public static void main(String[] args) {
		Product obj=new Product();
		obj.addProductDetails("Coffee",123, 85);
        System.out.println(obj.displayDetails());
	}

}
