package com.company.repeatEnd;

public class RepeatEnd {
    public String repeatEnd(String str,int n){
        String result = "";
        result =str.substring(str.length()-n);
        return result + result +result;
    }
}
