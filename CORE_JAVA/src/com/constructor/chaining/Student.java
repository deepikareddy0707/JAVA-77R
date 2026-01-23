package com.constructor.chaining;

public class Student {

    int id;
    String name;
    String course;

    Student() {
        this(101, "DeepikaReddy");  
        System.out.println("Default constructor called");
    }

    Student(int id, String name) {
        this(id, name, "Java");  
    }

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
        System.out.println(id + " " + name + " " + course);
    }

    public static void main(String[] args) {
        new Student();
    }
}
