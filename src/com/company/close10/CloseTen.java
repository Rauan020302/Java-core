package com.company.close10;

public class CloseTen {
    public int closeTen (int a, int b){
        int c = Math.abs(a - 10);
        int d = Math.abs(b - 10);
        if (c < d){
            return a;
        }
        if (d < c){
            return b;
        }
        return 0;
    }
}
