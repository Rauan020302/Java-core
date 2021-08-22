package com.company.evenlySpaced;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c){
        int aDiff = 0;
        int bDiff = 0;
        int cDiff = 0;

        if (a == b && a == c){
            return true;
        }
        if (a == b || b == c || a == c){
            return false;
        }
        aDiff = Math.abs(a - b);
        bDiff = Math.abs(a - c);
        cDiff = Math.abs(b - c);

        if (aDiff == bDiff)
            return true;
        if (aDiff == cDiff)
            return true;
        if (bDiff == cDiff)
            return true;
        return false;
    }
}
