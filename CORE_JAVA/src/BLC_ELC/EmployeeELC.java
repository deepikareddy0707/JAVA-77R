package BLC_ELC;

public class EmployeeELC {

	public static void main(String[] args) {
		EmployeeBLC emp= new EmployeeBLC();
		emp.setEmployeeId(41);
		emp.setEmployeeName("Deepika Reddy");
		emp.setEmployeeSalary(40000d);
		System.out.println(emp.displayData());

	}

}
