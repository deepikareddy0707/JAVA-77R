package variables;

class SimpleInterest {
    static double principal = 5000, rate = 5, time = 2;

    static void calculateInterest() {
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }

    public static void main(String[] args) {
        calculateInterest();
    }
}

