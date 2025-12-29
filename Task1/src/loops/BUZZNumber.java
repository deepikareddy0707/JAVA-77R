package loops;

public class BUZZNumber {

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {
        int num = 27;

        if (isBuzz(num)) {
            System.out.println(num + " is a Buzz Number");
        } else {
            System.out.println(num + " is NOT a Buzz Number");
        }
    }
}
