package com.company.caughtSpeeding;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday){
        if (isBirthday){
            speed -= 5;
        }
        if (speed <= 60){
            return 0;
        }else if (speed >= 81){
            return 2;
        }else {
            return 1;
        }
    }
}
