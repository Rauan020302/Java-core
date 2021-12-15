package com.company;

import java.util.LinkedList;

public class States {
    public static void main(String[] args) {
        LinkedList<String> statesKGZ = new LinkedList<>();
        statesKGZ.add("Chuy");
        statesKGZ.add("Osh");
        statesKGZ.add("Batken");
        statesKGZ.add("Talas");
        statesKGZ.add("Naryn");
        statesKGZ.addFirst("Jalal-Abad");
        statesKGZ.addLast("Yssyk-Kol");

        for (String str : statesKGZ){
            System.out.println(str);
        }

        System.out.println("/////////////");
        System.out.println(statesKGZ.contains("Bishkek"));
        System.out.println("/////////////");

        LinkedList<Person> personLinkedList = new LinkedList<>();

        personLinkedList.addFirst(new Person("Roma"));
        personLinkedList.addLast(new Person("Alex"));
        personLinkedList.add(new Person("Fox"));

        for (Person p: personLinkedList) {
            System.out.println(p.getPerson());
        }





    }
}
