package com.company.inOrderEqual;

public class InOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk){
        if (!equalOk){
            return a < b && b < c;
        }
        if (a < b && b < c){
            return true;
        }
        return a == b || b == c;
    }
}
