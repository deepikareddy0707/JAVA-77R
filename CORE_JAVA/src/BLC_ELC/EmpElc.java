package BLC_ELC;

public class EmpElc {

	public static void main(String[] args) {
EmpBlc emp=EmpBlc.getEmployeeDetails(43,"deepika Reddy", 400000.0);

System.out.println(emp.getEmployeeId());
System.out.println(emp.getEmployeeName());
System.out.println(emp.getEmployeeSalary());

	}

}
