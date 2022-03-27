package com.company.synchronize;

import com.company.synchronize.Counter;

public class SynchThread extends Thread {
    private Thread thread;
    private String name;
    final Counter counter;

    public SynchThread(String name, Counter counter) {
        this.name = name;
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) {
            System.out.println("Thread " + name + " is running...");
            counter.displayCounter();
            System.out.println("Leaving " + name + " thread... ");
        }
    }

    public void start() {
        System.out.println("Thread " + name + " successfully started.");
        if (thread == null) {
            thread = new Thread(this, name);
            thread.start();
        }
    }
}
