package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element1");
        list.add("element3");
        System.out.println(list);

        list.add(null);
        System.out.println(list);

        list.add("element2");
        list.add("element4");
        list.add("element5");
        list.remove(4);
        System.out.println(list);
        System.out.println(list.get(3));



    }
}
