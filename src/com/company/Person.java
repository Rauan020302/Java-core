package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex{
        MALE,FEMALE
    }

    String name;
    int age;
    String emailAddress;
    Sex gender;

    public Person(String name, int age, String emailAddress, Sex gender) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.gender = gender;

    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void printPerson(){
        System.out.println(this.toString());
    }
    public static List<Person> generateDefaultList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Rauan",20,"Rauan@Gmail.com",Sex.MALE));
        people.add(new Person("Rauan1",21,"Rauan1@Gmail.com",Sex.MALE));
        people.add(new Person("Rauan2",22,"Rauan2@Gmail.com",Sex.MALE));

        return people;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }
}
