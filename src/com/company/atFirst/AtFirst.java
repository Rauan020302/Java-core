package com.company.atFirst;

public class AtFirst {
    public String atFirst(String str){
        if (str.length() < 2){
            return str + "@";
        }
        if (str.length() == 2){
            return str;
        }

        return str.substring(0,2);
    }
}
