package com.company.frontBack;

public class FrontBack {
    public String frontBack(String str){
        if (str.length() < 2)return str;
        String mid = str.substring(1,str.length()-1);

        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
}
