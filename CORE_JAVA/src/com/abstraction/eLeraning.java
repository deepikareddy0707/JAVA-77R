package com.abstraction;

abstract class User {
    String username, email;

    User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    abstract void accessDashboard();

    void login() {
        System.out.println("Login successful.");
    }

    void logout() {
        System.out.println("Logout successful.");
    }

    void updateProfile() {
        System.out.println("Profile updated successfully.");
    }
}
class Student extends User {
    Student(String username, String email) {
        super(username, email);
    }

    void accessDashboard() {
        System.out.println("Accessing student dashboard.");
    }
}
public class eLeraning {
    public static void main(String[] args) {
System.out.println("\n=== E-Learning User System ===");
User student = new Student("student1", "student1@example.com");

student.login();
student.accessDashboard();
student.updateProfile();
student.logout();
}
}