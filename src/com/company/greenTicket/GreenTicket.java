package com.company.greenTicket;

public class GreenTicket {
    public int greenTicket(int a, int b, int c){
        if (a != b && b != c){
            return 0;
        }
        if (a == b && b == c){
            return 20;
        }
        return 10;
    }
}
