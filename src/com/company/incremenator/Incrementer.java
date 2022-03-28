package com.company.incremenator;

public class Incrementer extends Thread {
    private volatile boolean mIsIncrement = true;

    public void changeAction() {
        mIsIncrement = !mIsIncrement;
    }

    @Override
    public void run() {
        do {
            if (!Thread.interrupted()) {
                if (mIsIncrement)
                    Program.mValue++;
                else
                    Program.mValue--;

                System.out.println(Program.mValue + " ");
            } else
                return;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        } while (true);

    }
}

class Program {
    public static int mValue = 0;
    static Incrementer mInc;

    public static void main(String[] args) {
        mInc = new Incrementer();
        System.out.println("Value = ");
        mInc.start();

        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(i * 2 * 1000);
            } catch (InterruptedException e) {

            }
            mInc.changeAction();
        }
        mInc.interrupt();


    }
}
