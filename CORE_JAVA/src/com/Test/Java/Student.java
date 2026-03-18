package com.Test.Java;
import java.util.*;
import java.util.function.*;


@FunctionalInterface
interface EligibilityChecker {
    boolean checkEligibility(double average);
}
class Student1 {

    private int studentId;
    private String studentName;
    private int[] marks = new int[3];

    // Getters and Setters

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setMarks(int index, int value) {
        if(value < 0 || value > 100) {
            throw new IllegalArgumentException("Marks should be between 0 and 100");
        }
        marks[index] = value;
    }

    public int[] getMarks() {
        return marks;
    }

    // Calculate Total
    public int calculateTotal() {
        return marks[0] + marks[1] + marks[2];
    }

    // Calculate Average
    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    // Display Student Details
    public void displayStudentDetails(String grade, String result, String eligibility) {

        System.out.println("\nStudent ID : " + studentId);
        System.out.println("Student Name : " + studentName);

        System.out.print("\nMarks : ");
        for(int m : marks) {
            System.out.print(m + " ");
        }

        System.out.println("\n\nTotal Marks : " + calculateTotal());
        System.out.println("Average : " + calculateAverage());

        System.out.println("\nResult : " + result);
        System.out.println("Grade : " + grade);
        System.out.println("Eligibility : " + eligibility);
    }
}


public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student1 students[] = new Student1[3];

        // Predicate → PASS or FAIL
        Predicate<Double> passCheck = avg -> avg >= 35;

        // Function → Grade Calculation
        Function<Double, String> gradeCalc = avg -> {
            if(avg >= 75) return "A";
            else if(avg >= 60) return "B";
            else if(avg >= 50) return "C";
            else return "D";
        };

        // Eligibility Checker (Custom Interface)
        EligibilityChecker eligibility = avg -> avg >= 40;

        // Consumer → Display Student
        Consumer<Student1> display = s -> {

            double avg = s.calculateAverage();

            String result = passCheck.test(avg) ? "PASS" : "FAIL";
            String grade = gradeCalc.apply(avg);
            String elig = eligibility.checkEligibility(avg) ?
                    "Eligible for Certificate" :
                    "Not Eligible";

            s.displayStudentDetails(grade, result, elig);
        };

        for(int i = 0; i < students.length; i++) {

            students[i] = new Student1();

            try {

                System.out.print("\nEnter Student ID : ");
                students[i].setStudentId(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter Student Name : ");
                students[i].setStudentName(sc.nextLine());

                System.out.println("\nEnter Marks");

                for(int j = 0; j < 3; j++) {

                    System.out.print("Module " + (j+1) + " : ");
                    int mark = sc.nextInt();

                    students[i].setMarks(j, mark);
                }

            }

            catch(InputMismatchException e) {
                System.out.println("Invalid input type.");
                sc.nextLine();
                i--;
            }

            catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        // Display All Students
        System.out.println("\n===== Student Results =====");

        for(Student1 s : students) {
            display.accept(s);
        }
        sc.close();
    }
}

