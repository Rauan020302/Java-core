package com.company.mixString;

public class MixString {
//    public String mixString(String a, String b){
//        String result = "";
//
//        for (int i = 0; i < 4; i++){
//            if (i % 2 == 1){
//                result = result + a.charAt(i);
//            }
//            if (i % 2 == 0){
//                result = result + b.charAt(i);
//            }
//        }
//        return result;
//    }
    public String mixString(String a, String b) {
        int min = Math.min(a.length(),b.length());
        String mix= "";
        for(int i = 0; i < min; i++) {
            mix = mix + a.charAt(i) + b.charAt(i);
        }
        return mix = mix + b.substring(min) + a.substring(min);
    }
}
