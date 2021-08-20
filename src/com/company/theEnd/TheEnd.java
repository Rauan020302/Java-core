package com.company.theEnd;

public class TheEnd {
    public char theEnd(String str,boolean front){

        char a;
        if (front){
             a = str.charAt(0);
        }else{
            a = str.charAt(str.length()-1);
        }

        return a;
    }
}
