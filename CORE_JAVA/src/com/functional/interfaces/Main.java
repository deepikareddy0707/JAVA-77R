package com.functional.interfaces;

interface NumberChecker {
    boolean checkNumber(int num);
}
interface CharChecker {
    void checkChar(char c);
}
public class Main {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        NumberChecker numberChecker = new NumberChecker() {

            public boolean checkNumber(int num) {

                boolean result = Main.isPrime(num);

                if (result) {
                    System.out.println(num + " is Prime");
                } else {
                    System.out.println(num + " is Not Prime");
                }
                return result;
            }
        };
        numberChecker.checkNumber(7);
        CharChecker charChecker = new CharChecker() {

            public void checkChar(char c) {

                int ascii = (int) c;

                boolean result = Main.isPrime(ascii);

                if (result) {
                    System.out.println("ASCII value of " + c + " (" + ascii + ") is Prime");
                } else {
                    System.out.println("ASCII value of " + c + " (" + ascii + ") is Not Prime");
                }
            }
        };
        charChecker.checkChar('A');
    }
}