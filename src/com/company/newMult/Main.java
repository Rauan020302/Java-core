package com.company.newMult;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println("***********");
//        }
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        Thread thread = new Thread(new MyNewThread());
        thread.start();


    }


}

class MyNewThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("++++++++++++" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("------------" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
