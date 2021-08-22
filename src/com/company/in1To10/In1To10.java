package com.company.in1To10;

public class In1To10 {
    public boolean in1To10(int n, boolean outsideMode){
        if (outsideMode){
            if (n > 10){
                return true;
            }
        }
        if (!outsideMode){
            return n < 10;
        }
        return false;
    }
}
