package com.company.commonEnd;

public class CommonEnd {
    public boolean commonEnd(int[] a, int[] b){
        if (a.length > 1 && b.length > 1){
            if (a[0] == b[0]){
                return true;
            }else return a[a.length - 1] == b[b.length - 1];
        }
        return false;
    }
}
