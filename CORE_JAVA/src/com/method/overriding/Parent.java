package com.method.overriding;

 class Parent {
	 static void print() {
		 System.out.println("Parent");
	 }
 }
class Child extends Parent{
	static void print() {
		System.out.println("Child");
	}
}
class Display{
	public static void main(String[] args) {
		Parent.print();
		Child.print();
	}

}
