package com.company.without2;

public class Without2 {
    public String without2(String str){
        String result = str.substring(str.length()-2);
        if (str.substring(0,2).equals(result)){
            result = str.substring(2);
        }
        return result;
    }
}
