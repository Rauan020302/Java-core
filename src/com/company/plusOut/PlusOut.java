package com.company.plusOut;

public class PlusOut {
    public String plusOut(String str, String word) {
        String result = "";
        int i = 0 ;

        while(i < str.length() ) {
            if (str.substring(i).startsWith(word)) {
                result = result + word;
                i = i + word.length();
            } else {
                result = result + "+" ;
                i++;
            }
        }

        return result ;
    }
}
