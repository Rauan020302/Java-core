package com.company.maxMinMiddle;

import java.util.Random;

public class FirstMain {
    public static void main(String[] args) {
        int n = 100;
        int[] array = new int[n];
        Random rand = new Random();
        for (int i = 0;i<array.length;i++){
            array[i] = 10 + rand.nextInt(90);
            System.out.println(i + " - " + array[i]);
        }

        int max = array[0];
        int min = array[0];
        int sum = 0;
        double avg;

        for (int i = 0;i<array.length; i++){
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }

            sum += array[i];


        }
        avg = sum / n;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
