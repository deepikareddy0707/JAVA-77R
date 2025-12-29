package loops;

public class DisariumNumber {

    public static boolean isDisarium(int num) {
        String s = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            sum += Math.pow(digit, i + 1);
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 135;

        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium Number");
        } else {
            System.out.println(number + " is NOT a Disarium Number");
        }
    }
}

