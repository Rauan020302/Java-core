package com.company.stringX;

import com.company.stringSplosion.StringSplosion;

public class StringX {
    public String stringX(String string){
        String result = "";

        for (int i = 0;i < string.length();i++){
            if (!(i > 0 && i < (string.length()-1) && string.substring(i, i+1).equals("x"))){
                result = result + string.substring(i,i+1);
            }
        }
        return result;
    }
}
