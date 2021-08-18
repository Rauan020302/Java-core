package com.company.startHi;

public class StartHi {
    public boolean startHi(String str){
        if (!str.substring(0, 2).equals("hi")){
            return false;
        }
        return true;
    }
}
