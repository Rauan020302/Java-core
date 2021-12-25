package com.company.Mult1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();


        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

        System.out.println("Main end");

        for (int i = 0; i < 10;i++){
            System.out.println("l: " + i);
        }

    }
}
