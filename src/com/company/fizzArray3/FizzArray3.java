package com.company.fizzArray3;

public class FizzArray3 {
    public int[] fizzArray3(int start, int end){
        int sum = end - start;
        int[] result = new int[sum];

        for (int i = start; i < end; i++){
            result[i- start] = i;

        }
        return result;
    }
}
