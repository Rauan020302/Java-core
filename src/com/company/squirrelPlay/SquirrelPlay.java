package com.company.squirrelPlay;

public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer){
        if (isSummer){
            if (temp >= 60 && temp <= 100){
                return true;
            }
        }
        if (!isSummer){
            return temp >= 60 && temp <= 90;
        }
        return false;
    }
}
