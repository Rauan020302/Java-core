package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassExample {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);

        List<Integer> numbersEnd = new ArrayList<>(numbers);
        numbersEnd.add(5);
        numbersEnd.add(6);
        numbersEnd.add(7);
        numbersEnd.add(8);
        System.out.println(numbersEnd);

        numbersEnd.addAll(numbers);
        System.out.println(numbersEnd);

        List<String> language = new ArrayList<>();
        language.add("Java");
        language.add("C++");
        language.add(".net");
        language.add("Python");
        System.out.println("is the language list empty? : " + language.isEmpty());

        System.out.println("count of language - " + language.size());

        String bestLanguage = language.get(0);
        System.out.println("best language -  " + bestLanguage);

        language.set(1,"C");
        System.out.println(language);






    }
}
