package _4_11_25;



public class Example1 {
	String employeeName;
	int employeeId;
	long employeeSalary;
	
	public void addEmployeeDetails(String name,int Id,long Salary) {
		
		employeeName=name;
		employeeId=Id;
		employeeSalary=Salary;
		
	}
	
     
	public String displayDetails() {
		return "Employee Name : " +employeeName+ " Employee ID :" +employeeId+ " Employee Salary :" +employeeSalary;
	}
	
	public static void main(String[] args) {
		Example1 obj=new Example1();
		obj.addEmployeeDetails("Deepika", 21, 100);
		System.out.println(obj.displayDetails());
		

	}

}
