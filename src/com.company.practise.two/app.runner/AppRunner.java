package com.company.practise.two.app.runner;

import java.util.HashMap;
import java.util.Map;

public class AppRunner {
    public void trySmth() {
        HashMap<String, String> myHashMap1 = new HashMap<String, String>();

        myHashMap1.put("Basil", "07.12.1987");
        myHashMap1.put("Kate", "12.10.1971");
        myHashMap1.put("Lena", "11.01.1991");
        for(Map.Entry<String, String> entry: myHashMap1.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

        HashMap<Integer, String> myHashMap = new HashMap<>();

        myHashMap.put(1,"marik");
        myHashMap.put(2,"Guilia");
        myHashMap.put(3,"Bmw");

        System.out.println(myHashMap.get(3));

        System.out.println(myHashMap);

        for (Map.Entry<Integer,String> entry : myHashMap.entrySet())
            System.out.println(entry.getKey() + "-" + entry.getValue());
    }
}
