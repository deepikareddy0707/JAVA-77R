package com.Arrays;

class Course {
 String courseName;
 int[] marks;   
 Course(String courseName, int[] marks) {
     this.courseName = courseName;
     this.marks = marks;
 }
 double getCourseAverage() {
     int sum = 0;
     for (int i = 0; i < marks.length; i++) {
         sum += marks[i];
     }
     return (double) sum / marks.length;
 }
}
class Student {

 int rollNo;
 String name;
 Course[] courses;  
 Student(int rollNo, String name, Course[] courses) {
     this.rollNo = rollNo;
     this.name = name;
     this.courses = courses;
 }
 double getOverallAverage() {
     double total = 0;

     for (int i = 0; i < courses.length; i++) {
         total += courses[i].getCourseAverage();
     }
     return total / courses.length;
 }
 void displayStudentPerformance() {
     System.out.println("Roll No: " + rollNo);
     System.out.println("Name: " + name);

     for (int i = 0; i < courses.length; i++) {
         System.out.println("Course: " + courses[i].courseName +
                 " | Average: " + courses[i].getCourseAverage());
     }

     System.out.println("Overall Average: " + getOverallAverage());
     System.out.println("----------------------------------------");
 }
}

public class College {
 public static void main(String[] args) {
     Course[] courses1 = new Course[3];
     courses1[0] = new Course("Maths", new int[]{80, 85, 78, 90});
     courses1[1] = new Course("Physics", new int[]{75, 70, 72, 68});
     courses1[2] = new Course("Chemistry", new int[]{88, 84, 86, 90});

     Student student1 = new Student(101, "AAABC", courses1);
     Course[] courses2 = new Course[3];
     courses2[0] = new Course("Maths", new int[]{60, 65, 58, 70});
     courses2[1] = new Course("Physics", new int[]{55, 50, 52, 48});
     courses2[2] = new Course("Chemistry", new int[]{68, 64, 66, 72});
     Student student2 = new Student(102, "BBCD", courses2);
     student1.displayStudentPerformance();
     student2.displayStudentPerformance();
 }
}
