package com.company.middleThree;

public class MiddleThree {
    public String middleThree(String str){
        if (str.length()% 2 == 1) {

            int mid = str.length() / 2;
            return str.substring(mid - 1, mid + 2);
        }
        return str;
    }
}
