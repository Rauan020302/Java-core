package com.company.firstHalf;

public class FirstHalf {
    public String firstHalf(String str){
        int mid = str.length()/2;
        String result = str.substring(0,mid);
        return result;
    }
}
