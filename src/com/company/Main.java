package com.company;

import com.company.no34.No34;
import com.company.no9.No9;
import com.company.noLong.NoLong;
import com.company.noNeg.NoNeg;
import com.company.noTeen.NoTeen;
import com.company.noYY.NoYY;
import com.company.noZ.NoZ;
import com.company.square56.Square56;
import com.company.two2.Two2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(34);
        list.add(25);
        list.add(14);
        list.add(-3);
        list.add(12);
        list.add(99);
        list.add(69);
        NoNeg noNeg = new NoNeg();
        System.out.println(noNeg.noNeg(list));

        No9 no9 = new No9();
        System.out.println(no9.no9(list));

        NoTeen noTeen = new NoTeen();
        System.out.println(noTeen.noTeen(list));

        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("bbb");
        strings.add("czccc");
        strings.add("abcde");
        strings.add("b");
        strings.add("12");
        NoZ noZ = new NoZ();
        System.out.println(noZ.noZ(strings));

        NoLong noLong = new NoLong();
        System.out.println(noLong.noLong(strings));

        No34 no34 = new No34();
        System.out.println(no34.no34(strings));

        NoYY noYY = new NoYY();
        System.out.println(noYY.noYY(strings));

        Two2 two2 = new Two2();
        System.out.println(two2.two2(list));

        Square56 square56 = new Square56();
        System.out.println(square56.square56(list));
    }
}
