package com.company.middleTwo;

public class MiddleTwo {
    public String middleTwo(String str){
        String result = "";
        if (str.length() % 2 == 0){
            int mid = str.length()/2;
            result = str.substring(mid-1,mid+1);
        }
        return result;
    }
}
