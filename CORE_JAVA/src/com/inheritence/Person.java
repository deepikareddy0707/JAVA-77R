package com.inheritence;

class Person {
    Person() {
        System.out.println("Person object created");
    }
}

class Student extends Person {
    Student() {
        System.out.println("Student object created");
    }

    public static void main(String[] args) {
        Student s = new Student();
        
	}
}
