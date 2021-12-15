package com.company;

import java.util.Map;
import java.util.TreeMap;

public class SortedMapLesson {
    public static void main(String[] args) {
        TreeMap<Integer, String> statesKGZ = new TreeMap<>();
        statesKGZ.put(1,"Chuy");
        statesKGZ.put(21,"Naryn");
        statesKGZ.put(32,"Osh");
        statesKGZ.put(41,"Bishkek");
        statesKGZ.put(13,"Talas");

        TreeMap<String, String> contacts = new TreeMap<>();
        contacts.put("Rauan","02030202020302");
        contacts.put("Turan","0403040030403");
        contacts.put("Umut","030200123123032");
        contacts.put("Turash","123235346568245");
        contacts.put("Maks","0210204125213");

        System.out.println(statesKGZ.get(21));

        for (Map.Entry<Integer,String> i : statesKGZ.entrySet()) {
            System.out.printf("Key %s Value %s \n", i.getKey(),i.getValue());
        }

        for (Map.Entry<String,String> i : contacts.entrySet()) {
            System.out.printf("Key %s Value %s \n", i.getKey(),i.getValue());
        }





    }
}
