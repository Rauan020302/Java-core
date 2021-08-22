package com.company.noTeenSum;

public class NoTeenSum {
    public int noTeenSum(int a, int b, int c){
        int aNew = fixTeen(a);
        int bNew = fixTeen(b);
        int cNew = fixTeen(c);

        return aNew + bNew + cNew;
    }
    public int fixTeen(int n){
        if (n > 12 && n < 15){
            return 0;
        }
        if (n > 16 && n < 20){
            return 0;
        }
        return n;
    }
}
