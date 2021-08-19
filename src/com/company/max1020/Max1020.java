package com.company.max1020;

public class Max1020 {
    public int max1020(int a, int b){
        if (a >= 10 && a <= 20 && b >= 10 && b <= 20){
            if (a > b){
                return a;
            }else{
                return b;
            }
        }else if(a >= 10 && a <= 20){
            return a;
        }else if(b >= 10 && b <= 20){
            return b;
        }else{
            return 0;
        }
    }
}
