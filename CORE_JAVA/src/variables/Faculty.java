package variables;


public class Faculty {
	public static String universityName="Stanford University";
	String facultyName;
	String department;
	
	
	public void showFacultyDetails() {
		System.out.println("University Name : " +universityName);
		System.out.println("Faculty Name : " +facultyName);
		System.out.println("Department  : " +department);
		System.out.println("-------------------------");
		
	}
		
	public static void main(String[] args) {
		Faculty obj1=new Faculty();
		Faculty obj2=new Faculty();
		obj1.facultyName="Dr.Robert Brown";
		obj1.department="Computer Science";
		
		obj1.showFacultyDetails();
		
		obj2.facultyName="Dr.Lisa Green";
		obj2.department="Physics";
		
		obj2.showFacultyDetails();	
		
	}
	
}