package com.company;

public class Counter {
    private int x;

    public Counter() {
        this.x = 0;
    }

    public int getX() {
        return x ;
    }

    public synchronized void inc(){
        this.x++;
    }

    public synchronized void dec() {
        this.x--;
    }




}

