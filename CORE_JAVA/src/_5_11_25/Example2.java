package _5_11_25;


public class Example2 {
	String empname;
	String empdesg;
	long Salary;
	int empId;
	
	public String getName() {
		return empname;
	}
	public void setName(String nme) {
		empname=nme;
	}
	
	public String getDesg() {
		return empdesg;
	}
	
	public void setDesg(String dsg) {
		empdesg=dsg;
	}
	
	public long getSalary() {
		return Salary;
	}
	
	public void setSalary(long s1) {
		Salary=s1;
	}
	public int getId() {
		return empId;
	}
	public void setId(int id) {
		empId=id;
	}
	public static void main(String[] args) {
		Example2 obj=new Example2();
		obj.setName("Deepika Reddy");
		System.out.println(obj.getName());
		
		obj.setDesg("SE");
		System.out.println(obj.getDesg());
		
		obj.setSalary(200000);
		System.out.println(obj.getSalary());
		
		obj.setId(1);
		System.out.println(obj.getId());




	}

}
