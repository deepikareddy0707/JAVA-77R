package com.inheritence.task;

public class Student {
    String name, studentId;

    Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    void displayStudentInfo() {
        System.out.println("Name: " + name + ", Student ID: " + studentId);
    }
}

class Undergraduate extends Student {
    String major;

    Undergraduate(String name, String studentId, String major) {
        super(name, studentId);
        this.major = major;
    }

    void displayUndergraduateInfo() {
        System.out.println("Major: " + major);
    }
}

class Graduate extends Student {
    String thesisTopic;

    Graduate(String name, String studentId, String thesisTopic) {
        super(name, studentId);
        this.thesisTopic = thesisTopic;
    }

    void displayGraduateInfo() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

class PhDStudent extends Student {
    String researchArea;

    PhDStudent(String name, String studentId, String researchArea) {
        super(name, studentId);
        this.researchArea = researchArea;
    }

    void displayPhDStudentInfo() {
        System.out.println("Research Area: " + researchArea);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student undergraduate = new Undergraduate("Alice", "U12345", "Computer Science");
        undergraduate.displayStudentInfo();
        ((Undergraduate) undergraduate).displayUndergraduateInfo();

        Student graduate = new Graduate("Bob", "G67890", "Machine Learning");
        graduate.displayStudentInfo();
        ((Graduate) graduate).displayGraduateInfo();

        Student phd = new PhDStudent("Charlie", "P11223", "Artificial Intelligence");
        phd.displayStudentInfo();
        ((PhDStudent) phd).displayPhDStudentInfo();
    }
}
