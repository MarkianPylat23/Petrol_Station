package com.company.petrol.station.Lesson7;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {

        List<String> Food = Arrays.asList(" Appple", "banana");

        Map<Person,List <String>> map1 = new HashMap<>();
        map1.put(new Person("garik", 45 ), Food);
        System.out.println(map1);

        TreeMap<Person, List<String>> map2 = new TreeMap<>();
        map2.put(new Person("andriy", 67), Food);
        System.out.println(map2);

        LinkedHashMap<Person, List<String>> map3 = new LinkedHashMap<>();
        map3.put(new Person("oleg", 78), Food);
        System.out.println(map3);
    }
}
