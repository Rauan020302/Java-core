package com.company.starOut;

public class StarOut {
    public String starOut(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '*') {
                result = str.substring(0,i-1);
                result = result + str.substring(i + 2);
            }
        }
        return result;
    }
}
