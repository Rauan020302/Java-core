package com.company.converter;

public class fifthMain {
    public static void main(String[] args) {
        double temperature = 23.5;
        System.out.println("t = " + new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("t = " + new KelvinConverter().getConvertedValue(temperature));
        System.out.println("t = " + new FahrenheitConverter().getConvertedValue(temperature));
    }
}
