package com.company.missingChar;

public class MissingChar {
    public String missingChar(String str, int n){
        String newStr = str.substring(0,n);
        String last = str.substring(n+1,str.length());
        return newStr + last;
    }
}
