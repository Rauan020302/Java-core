package com.company.frontTimes;

public class FrontTimes {
    public String frontTimes(String str, int n){
        String result = "";
        String front = str.substring(0,3);
        for (int i = 0; i < n; i++){
            result = result + front;
        }
        return result;
    }
}
