package com.company.extraFront;

public class ExtraFront {
    public String extraFront(String str){
        String result = "";

        if (str.length()>1){
            result = str.substring(0,2);
            return result + result + result;
        }else if (str.length() == 1){
            result = str.substring(0,1);
            return result + result + result;
        }else{
            return str;
        }
    }
}
