package com.functional.interfaces;

import java.util.function.Function;

class SensorData {

    private double temperature;
    private double humidity;
    public SensorData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }
    public double getTemperature() {
        return temperature;
    }
    public double getHumidity() {
        return humidity;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
public class SensorTest {

    public static void main(String[] args) {

        SensorData data = new SensorData(28.5, 60);

        double threshold = 25.0;
        Function<SensorData, Double> getTemp = new Function<SensorData, Double>() {

            public Double apply(SensorData d) {
                return d.getTemperature();
            }
        };
        double temp = getTemp.apply(data);

        System.out.println("Extracted Temperature: " + temp);
        Function<Double, Boolean> checkTemp = new Function<Double, Boolean>() {
            public Boolean apply(Double t) {
                return t > threshold;
            }
        };
        boolean result = checkTemp.apply(temp);
        System.out.println("Temperature above threshold: " + result);
    }
}