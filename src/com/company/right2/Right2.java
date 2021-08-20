package com.company.right2;

public class Right2 {
    public String right2(String str){
        String result = "";
        result = str.substring(str.length()-2);
        return result + str.substring(0,str.length()-2);
    }
}
