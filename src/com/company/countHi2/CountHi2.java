package com.company.countHi2;

public class CountHi2 {
    public int countHi2(String str){
        int count = 0;
        for (int i = 0; i< str.length()-2; i++){
            if (str.charAt(i) != 'x' && str.charAt(i+1) == 'h' && str.charAt(i+2) == 'i'){
                count++;
            }
        }
        return count;
    }
}
