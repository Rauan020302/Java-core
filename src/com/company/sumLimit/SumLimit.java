package com.company.sumLimit;

public class SumLimit {
    public int sumLimit(int a, int b){
        String str = String.valueOf(a);
        int aLen =  str.length();
        if (a + b > 8){
            if (aLen == b){
                return a + b;
            }
            return a;
        }
        return a + b;
    }
}
