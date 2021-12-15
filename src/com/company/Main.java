package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();

        System.out.println(people.size());
        //Добавьте элементы к people

        people.add("Rauan");
        people.add("Turan");
        people.add("Emir");
        people.add("Elana");
        people.add("Turash");
        System.out.println(people.size());


        for (String person : people){
            System.out.println(person);
        }

        people.set(4,"Umut");
        System.out.println(people.get(4));

        System.out.println(people);
        people.remove("Rauan");

        if (people.contains("Rauan")){
            System.out.println("His name is Rauan");
        }
        else{
            System.out.println("we could not find Rauan");
        }
        System.out.println(people);

        Object[] peopleArrayOther = people.toArray();
        for (Object person1 : peopleArrayOther){
            System.out.println(person1);
        }
        System.out.println(peopleArrayOther.length);
    }
}
