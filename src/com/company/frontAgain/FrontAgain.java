package com.company.frontAgain;

public class FrontAgain {
    public boolean frontAgain(String str){
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))){
            return true;
        }else{
            return false;
        }
    }
}
