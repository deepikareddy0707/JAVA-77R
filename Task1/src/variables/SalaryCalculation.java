package variables;

public class SalaryCalculation {
	 static int basic = 20000, bonus = 5000;

	    static void calculateSalary() {
	        int total = basic + bonus;
	        System.out.println("Total Salary: " + total);
	    }

	    public static void main(String[] args) {
	        calculateSalary(); 
	    }
	}