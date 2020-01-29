package com.company.practise.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practise {
    public void tryHashMap() {
        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.size();
        myHashMap.put("Marik", "Yulyana");
        myHashMap.put("Yulik", "Zurek");
        myHashMap.put("Mesha", "Lesyk");

        System.out.println(myHashMap);

        if (myHashMap.containsValue("Yulyana")) {
            System.out.println("Yulyana is present");
        }

        for (String key : myHashMap.values()) {
            System.out.println("Value: " + myHashMap.get("Marik"));
        }
    }

    public void tryAnotherMap() {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("BMW", 5);
        hashMap.put("VW", 8);
        hashMap.put("Audi", 12);
        hashMap.put("Suzuki", 5);

        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        int value = hashMap.get("BMW");
        hashMap.put("BMW", value + 3);
        System.out.println("There will be  " + hashMap.get("BMW")+"BMW");
    }
}