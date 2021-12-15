package com.company;

import java.util.ArrayDeque;

public class QueueLesson {
    public static void main(String[] args) {
        ArrayDeque<String> countries = new ArrayDeque<>();

        countries.add("Germany");
        countries.add("Russia");
        countries.add("China");
        countries.add("USA");
        countries.add("France");

        System.out.println(countries);

        String firstEl = countries.getFirst();
        System.out.println(firstEl);

        System.out.println(countries.getLast());
        System.out.println(countries.size());

        while(countries.peek()!=null) {
            System.out.println(countries.pop());
        }

        ArrayDeque<Person> peoplePerson = new ArrayDeque<>();
        peoplePerson.addFirst(new Person("Tom"));
        peoplePerson.addFirst(new Person("Harry"));
        peoplePerson.addFirst(new Person("Ron"));
        peoplePerson.addFirst(new Person("Mark"));

        for (Person p : peoplePerson) {
            System.out.println(p.getPerson());
        }


    }
}
