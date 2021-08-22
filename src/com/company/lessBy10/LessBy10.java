package com.company.lessBy10;

public class LessBy10 {
    public boolean lessBy10(int a, int b, int c){
        if (a + 10 == b || a + 10 == c){
            return true;
        }
        if (b + 10 == a || b + 10 == c){
            return true;
        }
        return c + 10 == a || c + 10 == b;
    }
}
