package BLC_ELC;

public class libraryELC {

	public static void main(String[] args) {
		libraryBLC obj=new libraryBLC();
		obj.setBookID(121);
		obj.setTitle("My Inspiration");
		obj.setAuthor("Deepika Reddy");
		obj.setPrice(400d);
		
		libraryBLC obj1=new libraryBLC();
		obj1.setBookID(175);
		obj1.setTitle("Old Man Story");
		obj1.setAuthor("Arha Reddy");
		obj1.setPrice(250d);
		System.out.println(obj.displayData());

		System.out.println(obj1.displayData());

	}

}
