package loops;

public class SunnyNumber {

    public static boolean isSunny(int num) {
        int next = num + 1;
        int sqrt = (int) Math.sqrt(next);
        return sqrt * sqrt == next;
    }

    public static void main(String[] args) {
        int number = 8;

        if (isSunny(number)) {
            System.out.println(number + " is a Sunny Number");
        } else {
            System.out.println(number + " is NOT a Sunny Number");
        }
    }
}

