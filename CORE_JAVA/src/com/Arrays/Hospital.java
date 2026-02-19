package com.Arrays;

class Patient {
    int patientId;
    String name;
    double[] testResults;

    Patient(int patientId, String name, double[] testResults) {
        this.patientId = patientId;
        this.name = name;
        this.testResults = testResults;
    }
    double getAverageResult() {
        double sum = 0;
        for (int i = 0; i < testResults.length; i++) {
            sum += testResults[i];
        }
        return sum / testResults.length;
    }
    boolean hasCriticalValues() {
        for (int i = 0; i < testResults.length; i++) {
            if (testResults[i] < 50) {
                return true;
            }
        }
        return false;
    }
    void displayPatientReport() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);

        System.out.print("Test Results: ");
        for (int i = 0; i < testResults.length; i++) {
            System.out.print(testResults[i] + " ");
        }

        System.out.println("\nAverage Result: " + getAverageResult());
        System.out.println("-----------------------------------");
    }
}
public class Hospital {
    public static void main(String[] args) {
        Patient[] patients = new Patient[5];

        patients[0] = new Patient(101, "ABC", new double[]{60, 70, 80, 90, 55});
        patients[1] = new Patient(102, "DEF", new double[]{45, 65, 75, 85, 95});
        patients[2] = new Patient(103, "GHI", new double[]{88, 92, 76, 81, 79});
        patients[3] = new Patient(104, "JKL", new double[]{30, 40, 55, 60, 70});
        patients[4] = new Patient(105, "MNO", new double[]{90, 91, 89, 93, 95});

        System.out.println("Patients With Critical Test Values:\n");

        for (int i = 0; i < patients.length; i++) {
            if (patients[i].hasCriticalValues()) {
                patients[i].displayPatientReport();
            }
        }
    }
}
