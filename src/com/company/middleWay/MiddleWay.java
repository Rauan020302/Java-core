package com.company.middleWay;

public class MiddleWay {
    public int[] middleWay(int[] a, int[] b){
        int[] result = new int[2];
        if (a.length == 3 && b.length == 3){
            result[0] = a[1];
            result[1] = b[1];
        }
        return result;
    }
}
