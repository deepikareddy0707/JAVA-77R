package com.abstraction;

abstract class ReportGenerator {

    abstract void generateContent();

    void openFile() {
        System.out.println("Opening file.");
    }

    void writeContent() {
        System.out.println("Writing content.");
    }

    void saveFile() {
        System.out.println("Saving file.");
    }

    final void generateReport() {
        openFile();
        generateContent();
        writeContent();
        saveFile();
    }
}
class PDFReport extends ReportGenerator {
    void generateContent() {
        System.out.println("Generating PDF content with block text.");
    }
}
public class report {
    public static void main(String[] args) {
System.out.println("\n=== Report Generator ===");
ReportGenerator report = new PDFReport();
report.generateReport();
}
}