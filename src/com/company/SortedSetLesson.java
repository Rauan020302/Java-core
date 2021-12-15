package com.company;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetLesson {
    public static void main(String[] args) {
        TreeSet<String> statesKGZ = new TreeSet<>();
        statesKGZ.add("Chuy");
        statesKGZ.add("Osh");
        statesKGZ.add("Batken");
        statesKGZ.add("Talas");
        statesKGZ.add("Naryn");

        for (String s : statesKGZ) {
            System.out.println(s);
        }
        System.out.println(statesKGZ.first());
        System.out.println(statesKGZ.last());

        SortedSet<String> set = statesKGZ.subSet("Chuy","Talas");

        System.out.println(set);

        System.out.println(statesKGZ.higher("Naryn"));
        System.out.println(statesKGZ.lower("Naryn"));



    }
}
