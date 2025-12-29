package loops;

public class FibonacciCheck {

    static boolean isPerfectSquare(long x) {
        long s = (long) Math.sqrt(x);
        return s * s == x;
    }

    static boolean isFibonacci(long n) {
        return isPerfectSquare(5 * n * n + 4) ||
               isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
        long num = 8;
  System.out.println(isFibonacci(num)?"Fibonacci Number":"Not a Fibonacci Number");
    }
}

