package com.company.repeatFront;

public class RepeatFront {
    public String repeatFront(String str,int n){
        String result = "";
        for (int i = 0; i < n;i++) {
                result = result + str.substring(0,n-i);

        }
        return result;
    }
//    public String repeatFront(String str, int n) {
//        int len = str.length();
//        String newWord = "";
//
//        for (int i = n; n > 0; n--){
//            newWord += str.substring(0,n);
//        }
//        return newWord;
//    }

}
