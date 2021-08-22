package com.company.redTicket;

public class RedTicket {
    public int redTicket(int a, int b, int c){
        if (a == b && b == c && c == 2){
            return 10;
        }
        if (a == b && b == c && c == 0 | c == 1){
            return 5;
        }
        if (b != a && c != a){
            return 1;
        }
        return 0;
    }
}
