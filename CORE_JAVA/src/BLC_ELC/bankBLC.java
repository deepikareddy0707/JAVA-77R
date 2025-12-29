package BLC_ELC;

public class bankBLC {
	long accountNumber;
	String accountHolderName;
	double balance;
	
	public long getAccountNumber(){
		return accountNumber;
	}
	public void setAccountNumber(long AccountNumber) {
		accountNumber=AccountNumber;
	}
	
	public String getAccountHolderName(){
		return accountHolderName;
	}
	public void setAccountHolderName(String AccountHolderName) {
		accountHolderName=AccountHolderName;
	}
	public double getbalance(){
		return balance;
	}
	public void setbalance(double Balance) {
		balance=Balance;
	}
	
	public String displayData() {
		return "Account Number: " +accountNumber+ "\nAccount Hloder Name: " +accountHolderName+ "\nAccount Balance: " +balance;
	}

}
