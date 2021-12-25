package com.company.Mult2;

public class Main2 {

    public static Object monitor = new Object();
    public static char currentChar = 'A';

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (monitor) {
                    while (currentChar != 'A') {
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println('A');
                    currentChar = 'B';
                    monitor.notify();
                }
            }

        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (monitor) {
                    while (currentChar != 'B') {
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println('B');
                    currentChar = 'A';
                    monitor.notify();
                }
            }

        }).start();
    }
}
