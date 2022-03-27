package com.company;

public class ThreadNum1 implements Runnable{
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Thread guruThread = new Thread();
        guruThread.start();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        guruThread.setPriority(1);
        int guruPriority = guruThread.getPriority();
        System.out.println(guruPriority);
        System.out.println("Thread running");
    }
}
