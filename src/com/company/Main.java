package com.company;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box(50);
        Box box2 = new Box("String");

        BoxGen<Integer> intBox1 = new BoxGen<>(3);
        BoxGen<Integer> intBox2 = new BoxGen<>(12);
        BoxGen<Integer> intBox3 = new BoxGen<>(24);

        intBox1.getObj().doubleValue();
        intBox1.getObj().shortValue();

        BoxGen<String> strBox1 = new BoxGen<>("Rauan");
        BoxGen<String> strBox2 = new BoxGen<>("John");
        BoxGen<String> strBox3 = new BoxGen<>("Harry");

        strBox1.getObj().substring(1);
        strBox1.getObj().toLowerCase();

        NumberBox<Integer> numBox1 = new NumberBox<>(new Integer[]{1,2,3,4,5,6,7});
        System.out.println(numBox1.average());


    }
}
