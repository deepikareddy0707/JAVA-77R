package loops;

public class DuckNumber {

    public static boolean isDuck(int num) {
        String s = String.valueOf(num);

        if (s.charAt(0) == '0') {
            return false;
        }

        return s.contains("0");
    }

    public static void main(String[] args) {
        int number = 1023;

        if (isDuck(number)) {
            System.out.println(number + " is a Duck Number");
        } else {
            System.out.println(number + " is NOT a Duck Number");
        }
    }
}

