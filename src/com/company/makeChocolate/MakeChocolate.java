package com.company.makeChocolate;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal){
        if (small + big * 5 < goal) return -1;

        int smallNeeded = goal - big * 5;
        return Math.max(smallNeeded, 0);
    }
}
