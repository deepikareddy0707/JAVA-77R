package com.method.overriding;

 class Person {
	protected void display() {
		System.out.println("I am a person");
	}
 }
 class Student extends Person{
	 @Override
	 public void display() {
		 System.out.println("I am a student");
	 }
 }
    class Details{
	public static void main(String[] args) {
		Student std1=new Student();
		std1.display();

	}

}
