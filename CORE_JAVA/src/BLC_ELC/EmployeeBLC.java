package BLC_ELC;

public class EmployeeBLC {
	int employeeId;
	String employeeName;
	double salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int EmployeeID) {
		employeeId=EmployeeID;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String EmployeeName) {
		employeeName=EmployeeName;
	}
	
	public double getEmployeeSalary() {
		return salary;
	}
	public void setEmployeeSalary(double Salary) {
		salary=Salary;
	}
	
	public String displayData() {
		return "Employee ID: " +employeeId+ "\nEmployee Name: " +employeeName+ "\nEmployee Salary: " +salary;
	}
	
}