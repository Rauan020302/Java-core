package com.company.fizzArray;

public class FizzArray {
    public int[] fizzArray(int n){
        int[] result = new int[n];
        for (int i = 0; i < n;i++){
            result[i] = result[i] + i;
        }
        return result;
    }
}
