package com.method.overriding;

 class Animal {
	public void makeSound() {
		System.out.println("Animal Sound");
	}
}

 class Dog extends Animal{
	public void makeSound() {
		System.out.println("Bark");
	}
 }
	class Main{
	public static void main(String[] args) {
	Animal animal1=new Animal();
	animal1.makeSound();
	Animal animal=new Dog();
	animal.makeSound();
	}
	}

