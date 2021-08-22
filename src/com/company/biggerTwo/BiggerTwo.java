package com.company.biggerTwo;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b){
        int aSum = a[0] + a[1];
        int bSum = b[0] + b[1];
        if (a.length == 2 && b.length == 2){
            if (aSum > bSum){
                return a;
            }
            if (bSum > aSum){
                return b;
            }
            return a;

        }
        return a;

    }
}
