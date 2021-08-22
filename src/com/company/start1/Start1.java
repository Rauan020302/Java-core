package com.company.start1;

public class Start1 {
    public int start1(int[] a, int[] b){
        int count = 0;
        if (a[0] == 1 && b[0] == 1){
            count = 2;
        }
        else if (a[0] == 1){
            count = 1;
        }else if (b[0] == 1){
            count = 1;
        }

        return count;
    }
}
