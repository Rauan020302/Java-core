package com.company.mixStart;

public class MixStart {
    public boolean mixStart(String str) {
        if (!str.substring(1, 3).equals("ix")){
            return false;
        }
        return true;
    }
}
