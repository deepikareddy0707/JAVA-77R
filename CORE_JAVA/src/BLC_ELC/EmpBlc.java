package BLC_ELC;

public class EmpBlc {
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
	
	public static EmpBlc getEmployeeDetails(int employeeId, String employeeName, double salary) {
		EmpBlc emp=new EmpBlc();
		emp.setEmployeeId(employeeId);
		emp.setEmployeeName(employeeName);
		emp.setEmployeeSalary(salary);
		return emp;
	}
	

}
