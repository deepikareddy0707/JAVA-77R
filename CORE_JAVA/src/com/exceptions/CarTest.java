package com.exceptions;

class CarStopped extends Exception {

    CarStopped(String msg) {
        super(msg);
    }
}
class CarPuncture extends Exception {

    CarPuncture(String msg) {
        super(msg);
    }
}
class CarHeat extends Exception {

    CarHeat(String msg) {
        super(msg);
    }
}
public class CarTest {

    public static void Stop(String s) {

        try {
            if (s.equals("stop")) {
                throw new CarStopped("Car is stopped");
            } else {
                System.out.println("Car not stalled");
            }
        }
        catch (CarStopped e) {
            System.out.println("CarStopped: " + e.getMessage());
        }
    }

    public static void puncture(String s) {

        try {
            if (s.equals("puncture")) {
                throw new CarPuncture("Car is Punctured");
            } else {
                System.out.println("Car not punctured");
            }
        }
        catch (CarPuncture e) {
            System.out.println("CarPuncture: " + e.getMessage());
        }
    }

    public static void carHeat(int temp) {

        try {
            if (temp > 50) {
                throw new CarHeat("Car is heated more than 50 degrees");
            } else {
                System.out.println("Car not stalled");
            }
        }
        catch (CarHeat e) {
            System.out.println("CarHeat: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Stop("stop");
        puncture("puncture");
        carHeat(60);
    }
}