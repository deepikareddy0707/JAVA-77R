package _4_11_25;

public class Car {
	String carMake;
	String carModel;
	int manufacturingYear;
	
	void addCarDetails(String make,String model,int year) {
		carMake=make;
		carModel=model;
		manufacturingYear=year;
	}
	String displayDetails() {
		return "Car Make :" +carMake+ " Car Model : " +carModel+ " manufaturing Year : " +manufacturingYear;
	}
	

	public static void main(String[] args) {
		Car obj=new Car();
		obj.addCarDetails("Toyota","ABC",1990);
		System.out.println(obj.displayDetails());

	}

}
