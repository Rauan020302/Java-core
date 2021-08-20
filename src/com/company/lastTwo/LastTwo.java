package com.company.lastTwo;

public class LastTwo {
    public String lastTwo(String str){
        if (str.length() < 2){
            return str;
        }
        String a = str.substring(str.length()-1);
        String b = str.substring(str.length()-2,str.length()-1);
        String result = str.substring(0,str.length()-2);
        return result + a + b;
    }
}
