package com.company.prefixAgain;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n){
        String prefix = "";
        prefix = str.substring(0, n);
        for (int i = n; i < str.length()-n; i++){
            if (str.substring(i , i + n).equals(prefix))
                return true;
        }
        return false;
    }
}
