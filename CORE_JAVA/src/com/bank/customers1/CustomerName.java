package com.bank.customers1;

public class CustomerName {
	private int customerId;
	private String customerName;
	private String email;
	private long phoneNumber;
	private String accountType;
	private double balance;
	private boolean kycStatus;
	
	public CustomerName() {
		this("DeepikaReddy", 1234567809l);
		System.out.println("Customer Profile Initialized-Status:Pending KYC");
	}
	
    public CustomerName(String customerName,long phoneNumber) {
    	this("DeepikaReddy", 1234567809l, "current");
           this.customerName=  customerName;
           this.phoneNumber=phoneNumber;
	}
    public CustomerName(String customerName,long phoneNumber,String accountType) {
    	this("DeepikaReddy", 1234567809l, "current",101,2000.0,false);
    	this.accountType=accountType;
    	this.customerName=  customerName;
        this.phoneNumber=phoneNumber;
    }
    public CustomerName(String customerName,long phoneNumber,String accountType,int customerId,double balance,boolean kycStatus) {
    	this.customerId=customerId;
    	this.balance=balance;
    	this.kycStatus=kycStatus;
    	this.accountType=accountType;
    	this.customerName=  customerName;
        this.phoneNumber=phoneNumber;
    }
    public int getCustomerId() {
    	return customerId;
    }
    public void setCustomerId(int customerId) {
    	this.customerId=customerId;
    }
    public String getCustomerName() {
    	return customerName;
    }
    public void setCustomerName(String customerName) {
    	if(customerName!=null && !customerName.isBlank()) {
    	this.customerName=customerName;
    }
    }
    public String getEmail() {
    	return email;
    }
    public void setEmail(String email) {
    	if(email!=null && email.contains("@")) {
    	this.email=email;
    } 
    }
    public long getPhoneNumber() {
    	return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
    	if(String.valueOf(phoneNumber).length()==10) {
    	this.phoneNumber=phoneNumber;
    } 
    }
    public String getAccountType() {
    	return accountType;
    }
    public void setAccountType(String accountType) {
    	this.accountType=accountType;
    } 
    public double getBalance() {
    	return balance;
    }
    public void setBalance(double balance) {
    	if(balance>=0) {
    	this.balance=balance;
    } 
    }
    
    public boolean getIsKycStatus() {
    	return kycStatus;
    }
    public void setIsKycStatus(boolean kycStatus) {
    	this.kycStatus=kycStatus;
    } 
    
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    public void activateKYC() {
        if (!kycStatus) {
            kycStatus = true;
            System.out.println("KYC Activated Successfully");
        } else {
            System.out.println("KYC already activated");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }

        if (amount > 10000 && !kycStatus) {
            System.out.println("KYC required for withdrawal above 10000");
            return;
        }

        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public String getMaskedPhone() {
        String phone = String.valueOf(phoneNumber);
        return "******" + phone.substring(6);
    }

    public void viewAccountSummary() {
        System.out.println("\n------ ACCOUNT SUMMARY ------");
        System.out.println("Customer ID : " + customerId);
        System.out.println("Name        : " + customerName);
        System.out.println("Phone       : " + getMaskedPhone());
        System.out.println("Account     : " + accountType);
        System.out.println("Balance     : " + balance);
        System.out.println("KYC Status  : " + (kycStatus ? "Verified" : "Pending"));
        System.out.println("------------------------------");
    }

    
}
