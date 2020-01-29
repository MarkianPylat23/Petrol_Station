package com.company.practise.app.runner;

import com.company.practise.maps.Map;
import com.company.practise.maps.Practise;

public class AppRunner {
    public void runApp(){
        new Map().playMap();
        System.out.println("===========");
        new Practise().tryHashMap();
        System.out.println("+++++++++++++++++++++");
        new Practise().tryAnotherMap();
    }
}
