package com.company.comboString;

public class ComboString {
    public String comboString(String a, String b){
        if (a.length() > b.length()){
            return b + a + b;
        }else if (b.length() > a.length()){
            return a + b + a;
        } else if (a.length() == b.length()) {
            return a + b;
        }
        return "error";
    }
}
