package com.method.overriding;

 class Vehicle {
	public void start() {
		System.out.println("Vehicle started");
	}
}

 class Car extends Vehicle{
	 @Override
	public void start() {
		System.out.println("Car started");
	}
}
class Main1{
	public static void main(String[] args) {
		Vehicle vh=new Vehicle();
		vh.start();
		Vehicle vh1=new Car();
		vh1.start();

	}

}
