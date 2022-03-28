package com.company.eggOrChicken;

public class ChickenVoice {
    static EggVoice mAnotherOpinion;

    public static void main(String[] args) {
        mAnotherOpinion = new EggVoice();
        System.out.println("===Battle===");
        mAnotherOpinion.start();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Chicken!");
        }

        if (mAnotherOpinion.isAlive()) {
            try {
                mAnotherOpinion.join();
            }catch (InterruptedException e){

            }
            System.out.println("Egg is first!!!");
        }else{
            System.out.println("Chicken is first!!!");
        }
        System.out.println("===Stop===");
    }
}
