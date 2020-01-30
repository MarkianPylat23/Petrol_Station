package com.company.petrol.station.Lesson3;

import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Aplication {
    public static void main(String[] args) throws InterruptedException {

        Set<String> names = new HashSet<>();
        names.add("Oleg");
        names.add("Taras");
        names.add("Oleg");
        names.add("Vitali");
        names.add("Oleg");
        names.add("Vitali");
        names.add("Oksana");
        names.add("Viktoria");
        System.out.println(names);

        Set<String> names1 = new HashSet<>();
        names1.add("Oleg");
        names1.add("Taras");
        names1.add("Taras1");

        names.retainAll(names1);
        System.out.println(names);

        // ==========

        Set<Person> people = new HashSet<>();
        people.add(new Person("Oleg"));
        people.add(new Person("Taras"));
        people.add(new Person("Oleg"));
        people.add(new Person("Vitali"));
        people.add(new Person("Oleg"));
        people.add(new Person("Vitali"));
        people.add(new Person("Oksana"));
        people.add(new Person("Viktoria"));
        System.out.println(people);
        Thread.sleep(2000);

        long startTime = Instant.now().getEpochSecond();
        // HashSet
        long endTime = Instant.now().getEpochSecond();
        System.out.println("HashSet time: " + (endTime - startTime));
    }
}