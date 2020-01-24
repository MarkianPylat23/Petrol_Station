package com.company.practise.maps;

import java.util.ArrayList;
import java.util.List;

public class Map {
    public void playMap() {
        List<String> namesList = new ArrayList<>();

        namesList.add("Marik");
        namesList.add("Andrey");
        namesList.add("Oleg");
        namesList.add("Yuliyana");
        namesList.add("John");

        System.out.println(namesList);

        namesList.remove("John");

        System.out.println(namesList);
        System.out.println(namesList.get(2));

        if (namesList.contains("Marik")) {
            System.out.println("Marik is present");
        }
    }
}
