package loops;

public class AutomorphicNumber {
    static boolean isAutomorphic(int n) {
        int square = n * n;
        int temp = n;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int power = (int) Math.pow(10, digits);
        return square % power == n;
    }

    public static void main(String[] args) {
        int num = 25;
        System.out.println(isAutomorphic(num) ? 
            "Automorphic Number" : "Not an Automorphic Number");
    }
}
