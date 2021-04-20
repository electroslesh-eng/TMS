package com.home.leson6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Беларусь", "Минск");
        Address address2 = new Address("Беларусь", "Витебск");
        Person person1 = new Person("Ivan", 26, "male", address);
        Person person2 = new Person("Николай", 19, "male", address2);
        Person person3 = new Person("Николай", 20, "male", address);
        Person[] persons = {person1, person2, person3};
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        for (Person person : personList) {
            System.out.println(person);
        }

    }
}
