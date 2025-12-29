package variables;

public class Patient {
	public static String hospitalName="City Care Hospital";
	String patientName;
	int age;
	
	
	public void printDetails() {
		System.out.println("Hospital Name : " +hospitalName);
		System.out.println("Patient Name : " +patientName);
		System.out.println("patient Age : " +age);
		System.out.println("-------------------------");
		
	}
		
	public static void main(String[] args) {
		Patient obj1=new Patient();
		Patient obj2=new Patient();
		obj1.patientName="John Doe";
		obj1.age=45;
		
		obj1.printDetails();
		
		obj2.patientName="Emma Watson";
		obj2.age=30;
		
		obj2.printDetails();	
		
	}
	
}