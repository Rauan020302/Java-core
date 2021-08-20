package com.company.withoutX;

public class WithoutX {
    public String withoutX(String str){
        String result = "";
        if (str.substring(0,1).equals("x") && str.substring(str.length()-1).equals("x")){
            result = str.substring(1,str.length()-1);
            return result;
        }else if (str.substring(0,1).equals("x")){
            result = str.substring(1);
            return result;
        }else if (str.substring(str.length()-1).equals("x")){
            result = str.substring(0,str.length()-1);
            return result;
        }else
        return str;
    }
}
