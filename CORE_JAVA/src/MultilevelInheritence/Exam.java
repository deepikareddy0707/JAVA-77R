package MultilevelInheritence;

public class Exam {
    int examId;

    Exam(int examId) {
        this.examId = examId;
    }
}

class SubjectExam extends Exam {
    int m1, m2, m3;

    SubjectExam(int examId, int m1, int m2, int m3) {
        super(examId);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

class FinalExam extends SubjectExam {
    int passMarks;

    FinalExam(int examId, int m1, int m2, int m3, int passMarks) {
        super(examId, m1, m2, m3);
        this.passMarks = passMarks;
    }

    void result() {
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Exam ID: " + examId);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);

        if (m1 >= passMarks && m2 >= passMarks && m3 >= passMarks)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }

    public static void main(String[] args) {
        FinalExam fe =
            new FinalExam(501, 70, 65, 80, 40);
        fe.result();
    }
}
