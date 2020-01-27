package com.company.practise.maps;

import java.util.HashMap;

public class Practise {
    public void tryHashMap() {
        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.size();
        myHashMap.put("Marik","Yulyana");
        myHashMap.put("Yulik","Zurek");
        myHashMap.put("Mesha","Lesyk");

        System.out.println(myHashMap);

        if (myHashMap.containsValue("Yulyana")){
            System.out.println("Yulyana is present");
        }

        for (String key : myHashMap.values()){
            System.out.println("Value: " + myHashMap.get("Marik"));
        }
    }
}
