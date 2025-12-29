package BLC_ELC;

public class carBLC {
	int carId;
	String brand;
	String model;
	double rentalPricePay;
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int CarId) {
		carId=CarId;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String Brand) {
		brand=Brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String Model) {
		model=Model;
	}
	public double getRentalPricePay() {
		return rentalPricePay;
	}
	public void setRentalPricePay(double RentalPricePay) {
		rentalPricePay=RentalPricePay;
	}
	
	public String displayData() {
		return "CarID: " +carId+ "\nCar Brand: " +brand+ "\nCar Model: " +model+ "\nCar Rental Price: " +rentalPricePay;
	}
	

}
