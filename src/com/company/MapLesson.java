package com.company;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MapLesson {
    public static void main(String[] args) {
        Map<Integer,String> statesKGZ = new HashMap<>();
        statesKGZ.put(1,"Chuy");
        statesKGZ.put(2,"Naryn");
        statesKGZ.put(3,"Osh");
        statesKGZ.put(4,"Bishkek");
        statesKGZ.put(5,"Talas");

        System.out.println(statesKGZ.get(3));

        Map<String,String> statesStringMap = new HashMap<>();
        statesStringMap.put("First","Chuy");
        statesStringMap.put("Second","Osh");
        statesStringMap.put("Third","Bishkek");
        statesStringMap.put("Fourth","Talas");
        statesStringMap.put("Fifth","Naryn");

        System.out.println(statesStringMap.get("Second"));

        System.out.println(statesStringMap.keySet());
        System.out.println(statesStringMap.values());

        statesStringMap.replace("Third","JA");
        System.out.println(statesStringMap.get("Third"));

        System.out.println(statesStringMap.values());
        statesStringMap.remove("Fifth");
        System.out.println(statesStringMap.values());

        for (Map.Entry<String,String> i: statesStringMap.entrySet()) {
            System.out.printf("Key %s Value %s \n", i.getKey(), i.getValue());
        }

        Map<String,Person> people = new HashMap<>();

        people.put("Programmer",new Person("John"));
        people.put("Farmer",new Person("Elena"));
        people.put("Doctor",new Person("Watson"));
        people.put("PoliceMan",new Person("Sherlock"));

        for (Map.Entry<String,Person> item : people.entrySet()) {
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue().getPerson());
        }
    }
}
