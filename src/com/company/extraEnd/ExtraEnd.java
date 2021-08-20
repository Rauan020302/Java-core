package com.company.extraEnd;

public class ExtraEnd {
    public String extraEnd(String str){
        if (str.length() < 2){
            return "error";
        }
        String result = str.substring(str.length()-2);
        return result + result + result;
    }
}
