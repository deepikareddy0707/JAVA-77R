package BLC_ELC;

public class bankELC {

	public static void main(String[] args) {
		bankBLC obj=new bankBLC();
		obj.setAccountNumber(12345678l);
		obj.setAccountHolderName("Deepika Reddy");
		obj.setbalance(3000d);
		System.out.println(obj.displayData());
		
		

	}

}
