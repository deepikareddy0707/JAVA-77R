package com.inheritence.task;

class Vehicle {
    String make, model;
    int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println(make + " " + model + " " + year);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    void displayCarInfo() {
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Truck extends Vehicle {
    int cargoCapacity;

    Truck(String make, String model, int year, int cargoCapacity) {
        super(make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    void displayTruckInfo() {
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    void displayMotorcycleInfo() {
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 2022, 4);
        car.displayInfo();
        ((Car) car).displayCarInfo();

        Vehicle truck = new Truck("Ford", "F-150", 2021, 1000);
        truck.displayInfo();
        ((Truck) truck).displayTruckInfo();

        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street Glide", 2023, true);
        motorcycle.displayInfo();
        ((Motorcycle) motorcycle).displayMotorcycleInfo();
    }
}

