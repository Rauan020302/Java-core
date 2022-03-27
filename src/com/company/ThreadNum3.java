package com.company;

public class ThreadNum3 {
    public static void main(String[] args) {
        ThreadNum threadNum = new ThreadNum("guru1");
        threadNum.start();
        ThreadNum threadNum2 = new ThreadNum("guru2");
        threadNum2.start();
    }
}

class ThreadNum implements Runnable {
    Thread guruThread;
    private String name;

    public ThreadNum(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread running " + name);
        for (int i = 0; i < 4; i++) {
            System.out.println(i + " " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    }

    public void start() {
        System.out.println("Thread started ");
        if (guruThread == null) {
            guruThread = new Thread(this,name);
            guruThread.start();
        }
    }
}
