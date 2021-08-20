package com.company.withoutEnd;

public class WithoutEnd {
    public String withoutEnd(String str){
        if (str.length() < 2){
            return "error";
        }
        String result = str.substring(1,str.length()-1);
        return result;
    }
}
