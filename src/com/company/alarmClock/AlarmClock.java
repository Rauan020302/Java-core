package com.company.alarmClock;

public class AlarmClock {
    public String alarmClock(int day, boolean vacation){
        if (day > 7){
            return "Error";
        }
        if (vacation){
            if (day == 6 || day == 0){
                return "off";
            }
            else{
                return "10:00";
            }
        }
        if (day == 6 || day == 0){
            return "10:00";
        }
        else {
            return "7:00";
        }
    }
}
