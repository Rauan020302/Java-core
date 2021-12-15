package com.company;

import java.util.HashSet;

public class SetLesson {
    public static void main(String[] args) {
        HashSet<String> statesKGZ = new HashSet<>();
        statesKGZ.add("Chuy");
        statesKGZ.add("Osh");
        statesKGZ.add("Osh");
        statesKGZ.add("Osh");
        statesKGZ.add("Batken");
        statesKGZ.add("Talas");
        statesKGZ.add("Naryn");
        statesKGZ.add("Jalal-Abad");
        statesKGZ.add("Issyk-Kol");

        for (String state : statesKGZ) {
            System.out.println(state);
        }

        HashSet<Person> personLinkedList = new HashSet<>();

        personLinkedList.add(new Person("Alex"));
        personLinkedList.add(new Person("Roma"));
        personLinkedList.add(new Person("Scarlett"));

        for (Person p: personLinkedList) {
            System.out.println(p.getPerson());
        }




    }
}
