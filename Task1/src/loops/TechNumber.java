package loops;

public class TechNumber {

    static boolean isTech(int num) {
        int temp = num;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        if (digits % 2 != 0) {
            return false;
        }

        int power = (int) Math.pow(10, digits / 2);
        int firstHalf = num / power;
        int secondHalf = num % power;

        int sum = firstHalf + secondHalf;
        return sum * sum == num;
    }

    public static void main(String[] args) {
        int number = 2025;

        if (isTech(number)) {
            System.out.println(number + " is a Tech Number");
        } else {
            System.out.println(number + " is NOT a Tech Number");
        }
    }
}
