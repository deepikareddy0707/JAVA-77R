package BLC_ELC;

public class carELC {

	public static void main(String[] args) {
		
		carBLC obj=new carBLC();
		obj.setCarId(125);
		obj.setBrand("Toyota");
		obj.setModel("model-3");
		obj.setRentalPricePay(200000d);
		System.out.println(obj.displayData());
		
		carBLC obj1=new carBLC();
		obj1.setCarId(250);
		obj1.setBrand("Ford");
		obj1.setModel("model-2");
		obj1.setRentalPricePay(500000d);
		System.out.println(obj1.displayData());
		

	}

}
