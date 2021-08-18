package com.company.random;

import java.util.Random;

public class FourthMain {
    public static void main(String[] args) {

        int n = 10;
        int[] array = new int[n];
        Random rand = new Random();
        for (int i = 0;i<array.length;i++){
            array[i] = rand.nextInt(10);
            System.out.println(i + " - " + array[i]);
        }
        System.out.println("////////////////////");
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        RandomFromArray random = new RandomFromArray(array,weights);
        System.out.println(random.getRandom());

    }
}
