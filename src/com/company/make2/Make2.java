package com.company.make2;

public class Make2 {
    public int[] make2(int[] a, int[] b){
        int[] result = new int[2];
        if (a.length == 2){
            return a;
        }
        if (b.length == 2){
            return b;
        }
        if (a.length > 2){
            result[0] = a[0];
            result[1] = a[1];
            return result;
        }
        if (a.length == 1){
            result[0] = a[0];
            result[1] = b[0];
            return result;
        }
        result[0] = b[0];
        result[1] = b[1];
        return result;
    }
}
