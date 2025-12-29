package BLC_ELC;

public class onlineShoppingBLC {
	int productId;
	String productName;
	double price;
	int quantity;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int ID) {
		productId=ID;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String Name) {
		productName=Name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double Price) {
		price=Price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int Quantity) {
		quantity=Quantity;
	}
	
	public String displayData() {
		return "Product ID: " +productId+ "\nProduct Name: " +productName+ "\nProduct Price: " +price+ "\nProduct Quantity: " +quantity;
	}
}