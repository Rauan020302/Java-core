package com.company.teaParty;

public class TeaParty {
    public int teaParty(int tea, int candy){
        if (tea < 5 || candy < 5){
            return 0;
        }
        if (tea > candy){
            if (tea > candy*2){
                return 2;
            }
        }
        if (candy > tea){
            if (candy > tea * 2){
                return 2;
            }
        }
        return 1;
    }
}
