package com.company.blackjack;

public class Blackjack {
    public int blackjack(int a, int b){
        if (a == 21 || b == 21){
            return 21;
        }
        if (a > 21 && b > 21){
            return 0;
        }
        if (a > b && a > 21){
            return b;
        }
        if (b > a && b > 21){
            return a;
        }
        if (a > b){
            return a;
        }
        if (b > a){
            return b;
        }
        return 0;
    }
}
