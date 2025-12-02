package variables;

public class MarksCalculation {
	static int sub1=85,sub2=90,sub3=80;
	
	static void totalMarks() {
        int total = sub1 + sub2 + sub3;
        System.out.println("Total Marks: " + total);
    }

    static void averageMarks() {
        int total = sub1 + sub2 + sub3;
        double avg = total / 3.0; 
        System.out.println("Average Marks: " + avg);
    }

    public static void main(String[] args) {
        totalMarks();
        averageMarks();
    }
}
