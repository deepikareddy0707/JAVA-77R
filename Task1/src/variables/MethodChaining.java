package variables;

class MethodChaining {
    static int a = 20, b = 30; 

    static int sum() {
        System.out.println("Sum: " + (a+b));
        return a+b;
    }

    static double average() {
        sum();
        double avg = (a + b) / 2.0;
        System.out.println("Average: "+ avg);
          return avg;
    }

    public static void main(String[] args) {
        average();     }
}

