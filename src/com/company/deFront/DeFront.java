package com.company.deFront;

public class DeFront {
    public String deFront(String str){
        int len = str.length();
        String result = "";
        for (int i = 0; i < len; i++){
            if (i == 0 && str.charAt(i) == 'a')
                result += 'a';
            else if (i == 1 && str.charAt(i) == 'b')
                result += 'b';
            else if (i > 1)
                result += str.charAt(i);
        }
        return result;
    }
}
