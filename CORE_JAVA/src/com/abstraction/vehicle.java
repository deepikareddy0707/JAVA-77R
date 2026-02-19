package com.abstraction;

abstract class Vehicle {
    String modelName;
    String vehicleNumber;
    String company;

    Vehicle(String modelName, String vehicleNumber, String company) {
        this.modelName = modelName;
        this.vehicleNumber = vehicleNumber;
        this.company = company;
    }

    abstract void startEngine();

    String fuelType() {
        return "Petrol";
    }
}
class Car extends Vehicle {
    int numberOfDoors;
    boolean hasSunroof;

    Car(String modelName, String vehicleNumber, String company,
        int numberOfDoors, boolean hasSunroof) {
        super(modelName, vehicleNumber, company);
        this.numberOfDoors = numberOfDoors;
        this.hasSunroof = hasSunroof;
    }

    void startEngine() {
        System.out.println("Starting engine with key ignition.");
    }
}

class Bike extends Vehicle {
    boolean hasSidecar;

    Bike(String modelName, String vehicleNumber, String company,
         boolean hasSidecar) {
        super(modelName, vehicleNumber, company);
        this.hasSidecar = hasSidecar;
    }

    void startEngine() {
        System.out.println("Starting engine with kick-start.");
    }
}

class Truck extends Vehicle {
    int cargoCapacity;

    Truck(String modelName, String vehicleNumber, String company,
          int cargoCapacity) {
        super(modelName, vehicleNumber, company);
        this.cargoCapacity = cargoCapacity;
    }

    void startEngine() {
        System.out.println("Starting engine with heavy-load warm-up.");
    }

    String fuelType() {
        return "Diesel";
    }
}
public class vehicle {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Management System ===");
        Vehicle car = new Car("Toyota Camry", "ABC123", "Toyota", 4, true);
        Vehicle bike = new Bike("Yamaha R1", "XYZ789", "Yamaha", false);
        Vehicle truck = new Truck("Volvo FH", "DEF456", "Volvo", 20000);

        car.startEngine();
        System.out.println("Fuel Type: " + car.fuelType());

        bike.startEngine();
        System.out.println("Fuel Type: " + bike.fuelType());

        truck.startEngine();
        System.out.println("Fuel Type: " + truck.fuelType());
    }
}