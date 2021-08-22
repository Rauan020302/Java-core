package com.company.nearTen;

public class NearTen {
    public boolean nearTen(int num){
        int result = num % 10;
        return result == 1 || result == 2 || result == 9 || result == 8 || result == 0;
    }
}
