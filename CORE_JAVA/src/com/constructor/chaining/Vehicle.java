package com.constructor.chaining;

public class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor");
    }
}

class Car extends Vehicle {
    Car() {
        super();
        System.out.println("Car constructor");
    }

    public static void main(String[] args) {
        new Car();
    }
}
