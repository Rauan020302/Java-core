package com.company.sleepIn;

public class SleepIn {

    public boolean sleepIn(boolean weekDay,boolean vacation) {
        if (!weekDay || vacation) {
            return true;
        }else {
            return false;
        }
    }
}
