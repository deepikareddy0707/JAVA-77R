package variables;

public class Demo {
	
	public byte getByteValue() {	
		return 10;
	
	}
	public short getShortValue() {	
		return 15;
	}
	public int getintValue() {	
		return 5;
	}
	public long getlongValue() {	
		return 150;
	}
	public float getFloatValue() {
		return 15;
	}
	
	public  double getDoubleValue() {
		return 255555;
	}
	
	public char getCharValue() {
		return 'a';
	}
	
	public boolean getBooleanValue() {
		return true;
	}
	public String getStringValue() {
		return "Deepika Reddy";
	}
	public static void main(String[] args) {
		Demo obj1=new Demo();
		byte byteValue=obj1.getByteValue();
		System.out.println("Byte Value: " +byteValue);
		
		short shortValue=obj1.getShortValue();
		System.out.println("Short Value: " +shortValue);
		
		int intValue=obj1.getintValue();
		System.out.println("int Value: " +intValue);
		
		long longValue=obj1.getlongValue();
		System.out.println("Long Value: " +longValue);
		
		float floatValue=obj1.getFloatValue();
		System.out.println("Float Value: " +floatValue);
		
		double doubleValue=obj1.getDoubleValue();
		System.out.println("Double Value: " +doubleValue);
		
		char charValue=obj1.getCharValue();
		System.out.println("Char Value: " +charValue);
		
		boolean booleanValue=obj1.getBooleanValue();
		System.out.println("Boolean Value: " +booleanValue);
		
		String stringValue=obj1.getStringValue();
		System.out.println("String Value: " +stringValue);
		
		
		
		
	}
	
}
