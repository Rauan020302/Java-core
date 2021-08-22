package com.company.twoAsOne;

public class TwoAsOne {
    public boolean twoAsOne(int a, int b, int c){
        if (a > b && a > c){
            if (a == b + c){
                return true;
            }
        }
        if (b > a && b > c){
            if (b == a + c){
                return true;
            }
        }
        if (c > a && c > b){
            if (c == a + b){
                return true;
            }
        }
        return false;
    }
}
