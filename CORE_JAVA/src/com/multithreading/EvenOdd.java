package com.multithreading;

class NumberPrinter implements Runnable {
    private int start;
    private int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (start % 2 == 0 && i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } else if (start % 2 != 0 && i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

public class EvenOdd {
    public static void main(String[] args) throws InterruptedException {

        Thread evenThread = new Thread(new NumberPrinter(2, 20), "EvenNumber");
        Thread oddThread = new Thread(new NumberPrinter(1, 19), "OddNumber");

        evenThread.start();
        evenThread.join(); 

        oddThread.start();
    }
}