package loops;

public class SpyNumber {

    public static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    public static void main(String[] args) {
        int num = 123;

        if (isSpy(num)) {
            System.out.println(num + " is a Spy Number");
        } else {
            System.out.println(num + " is NOT a Spy Number");
        }
    }
}
