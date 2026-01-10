package com.java.test;

import java.util.Scanner;

class InsurancePolicy {
    String customerName;
    String policyType;
    double policyAmount;
    double approvedAmount;
    String status;

    InsurancePolicy(String customerName, String policyType, double policyAmount) {
        this.customerName = customerName;
        this.policyType = policyType;
        this.policyAmount = policyAmount;
        this.approvedAmount = 0;
        this.status = "Pending";
        System.out.println("Policy Profile Created");
    }

    void viewSummary() {
        System.out.println("\nPolicy Summary");
        System.out.println("Customer: " + customerName);
        System.out.println("Policy Type: " + policyType);
        System.out.println("Policy Amount: " + policyAmount);
        System.out.println("Approved Amount: " + approvedAmount);
        System.out.println("Policy Status: " + status);
    }
}

 class InsuranceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Policy Type: ");
        String type = sc.nextLine();
        System.out.print("Enter Policy Amount: ");
        double amount = sc.nextDouble();

        InsurancePolicy p = new InsurancePolicy(name, type, amount);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Update Approved Amount");
            System.out.println("2. Change Policy Status");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter Approved Amount: ");
                    double appAmt = sc.nextDouble();
                    if (appAmt >= 0 && appAmt <= p.policyAmount)
                        p.approvedAmount = appAmt;
                    else
                        System.out.println("Invalid amount");
                    break;

                case 2:
                    System.out.print("Enter Policy Status: ");
                    String st = sc.nextLine();
                    if (!st.isEmpty())
                        p.status = st;
                    else
                        System.out.println("Invalid status");
                    break;

                case 3:
                    p.viewSummary();
                    break;

                case 4:
                    return;
            }
            
            sc.close();
        }
    }
}
