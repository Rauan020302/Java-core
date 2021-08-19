package com.company.front3;

public class Front3 {
    public String front3(String str){
        if (str.length() >=3){
            String word = str.substring(0,3);
            return word+word+word;
        }else{
            return str;
        }
    }
}
