package com.java.test;

import java.util.Scanner;


public class SubscriptionPlan {
	
	private String subscriberName;
	private String planType;
	private double planCost;
	private double paidAmount;
	private String subscriptionStatus;
	
	public SubscriptionPlan(String subscriberName, String planType, double planCost, double paidAmount, String subscriptionStatus ) {
		this.subscriberName=subscriberName;
		this.planType=planType;
		this.planCost=planCost;
		this.paidAmount=paidAmount;
		this.subscriptionStatus=subscriptionStatus;
		System.out.println("\n Subscription profile created");
	}
	
	public void UpdatePaidAmount(double amount) {
		if(amount<=0) {
			System.out.println("Inavalid Paid Amount");
		}
		else {
			paidAmount+=amount;
			System.out.println("Payement Updated");
		}
	}
	public void ChangeSubscriptionStatus(String newSubscriptionStatus) {
		if((newSubscriptionStatus==null)||(newSubscriptionStatus.isEmpty())) {
			System.out.println("Invalid status");
		}
		else {
			newSubscriptionStatus=subscriptionStatus;
			System.out.println("Subscription status updated");
		}
	}
	public void ViewSummary() {
		System.out.println("Subscriber Name: " +subscriberName);
		System.out.println("Plan Type: " +planType);
		System.out.println("plan Cost: " +planCost);
		System.out.println("Paid Amount: " +paidAmount);
		System.out.println("Subscription Status: " +subscriptionStatus);

	}

}

 class SubscriptionSystem{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Subscriber Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Plan Type: ");
		String typeString=sc.next();
		System.out.println("Enter Plan Cost: ");
		double cost=sc.nextDouble();
//		System.out.println("Enter Paid Amount: ");
//		double amount=sc.nextDouble();
//		System.out.println("Enter Subscription Status: ");
//		String status=sc.next();
//		

SubscriptionPlan sub=new SubscriptionPlan(name, name, cost, cost, typeString);
while(true) {
System.out.println("----------Menu---------");
System.out.println("1. Update Payment");
System.out.println("2. Change Status");
System.out.println("3. View Summary");
System.out.println("4. Exit");
System.out.println("Enter choice");
int choice=sc.nextInt();
sc.nextLine();

	switch (choice) {
	case 1: {
		System.out.print("Enter Payment Amount");
		sub.UpdatePaidAmount(sc.nextDouble());
		break;
	}
	case 2:{
		System.out.print("Enter new Status");
		sub.ChangeSubscriptionStatus(sc.next());
		break;
	}
	case 3:{
		sub.ViewSummary();
		break;
	}
	case 4:{
		System.out.print("Exit");
		break;
	}	
	
	default:{
		System.out.print("Invalid Data");
		
		sc.close();

	}
	}
}

		
	}
}
