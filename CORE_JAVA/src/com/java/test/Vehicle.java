package com.java.test;
import java.util.Scanner;

class Vehicle {
    String ownerName;
    String vehicleNumber;
    String vehicleType;

    Vehicle(String ownerName, String vehicleNumber, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
}

class ServiceVehicle extends Vehicle {
    String serviceCenter;
    String serviceCategory;

    ServiceVehicle(String ownerName, String vehicleNumber, String vehicleType,
                   String serviceCenter, String serviceCategory) {
        super(ownerName, vehicleNumber, vehicleType);
        this.serviceCenter = serviceCenter;
        this.serviceCategory = serviceCategory;
        System.out.println("Vehicle Profile Created");
    }

    void viewProfile() {
        System.out.println("\nVehicle Profile Details");
        System.out.println("Owner: " + ownerName);
        System.out.println("Number: " + vehicleNumber);
        System.out.println("Type: " + vehicleType);
        System.out.println("Service Center: " + serviceCenter);
        System.out.println("Service Category: " + serviceCategory);
    }
}

 class VehicleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Owner Name: ");
        String owner = sc.nextLine();
        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String type = sc.nextLine();
        System.out.print("Enter Service Center Name: ");
        String center = sc.nextLine();
        System.out.print("Enter Service Category: ");
        String category = sc.nextLine();

        ServiceVehicle v = new ServiceVehicle(owner, number, type, center, category);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Update Service Category");
            System.out.println("2. Update Service Center");
            System.out.println("3. View Profile");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter new Service Category: ");
                    String newCat = sc.nextLine();
                    if (!newCat.isEmpty())
                        v.serviceCategory = newCat;
                    else
                        System.out.println("Invalid input");
                    break;

                case 2:
                    System.out.print("Enter new Service Center: ");
                    String newCenter = sc.nextLine();
                    if (!newCenter.isEmpty())
                        v.serviceCenter = newCenter;
                    else
                        System.out.println("Invalid input");
                    break;

                case 3:
                    v.viewProfile();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
                    
                    
                    sc.close();
            }
        }
    }
}
