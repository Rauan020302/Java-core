package com.company.lastChars;

public class LastChars {
    public String lastChars(String a, String b){
        if (a.length() == 0 && b.length() == 0){
            return "@@";
        }
        String aResult = a.substring(0,1);
        String bResult = b.substring(b.length()-1);

        if (b.length() != 0 && a.length() != 0){
            return aResult + bResult;
        }else if (b.length() == 0){
            return aResult + "@";
        }else if (a.length() == 0){
            return bResult + "@";
        }
        return "@@";
    }
}
