package com.company.conCat;

public class ConCat {
    public String conCat(String a, String b){
        if (a.length()==0 || b.length() == 0){
            return a + b;
        }
        if (a.substring(a.length()-1).equals(b.substring(0,1)))
            return a + b.substring(1);
        else
            return a + b;
    }
}
