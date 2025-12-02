package variables;

public class StudentMarks {

	static int marks1 = 78, marks2 = 85, marks3 = 90;

    static int total() {
        int totalMarks = marks1 + marks2 + marks3;
        System.out.println("Total Marks: " + totalMarks);
        return totalMarks;
    }

    static void percentage() {
        int totalMarks = total();  
        double percent = (totalMarks / 300.0) * 100;
        System.out.println("Percentage: " + percent + "%");
    }

    public static void main(String[] args) {
        percentage();  
    }
}
