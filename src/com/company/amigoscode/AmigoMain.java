package com.company.amigoscode;


import java.util.*;
import java.util.stream.Collectors;

public class AmigoMain {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        //imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person: people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        females.forEach(System.out::println);
        System.out.println();

        //filter
        List<Person> filter = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());
        filter.forEach(System.out::println);
        System.out.println();

        //sort
        List<Person> sort = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))//reversed
                .collect(Collectors.toList());
        sort.forEach(System.out::println);
        System.out.println();

        //All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 5);
        System.out.println(allMatch);
        System.out.println();

        //Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 90);
        System.out.println(anyMatch);
        System.out.println();

        //None match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getAge() > 90);
        System.out.println(noneMatch);
        System.out.println();

        //max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        System.out.println();

        //min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        System.out.println();

        //group
        Map<Gender,List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        groupByGender.forEach(((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        }));

        //the name of the oldest woman
        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestFemaleAge.ifPresent(System.out::println);





    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond",50,Gender.MALE),
                new Person("Natalie Portman",40,Gender.FEMALE),
                new Person("Scarlett Johansson",38,Gender.FEMALE),
                new Person("Charlie Chapman",80,Gender.MALE),
                new Person("Harry Potter",35,Gender.MALE),
                new Person("Emma Watson",33,Gender.FEMALE),
                new Person("Robert Downey j",60,Gender.MALE),
                new Person("Lily James",22,Gender.FEMALE)
        );
    }
}
