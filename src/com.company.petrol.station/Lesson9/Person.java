package com.company.petrol.station.Lesson9;

import java.io.Serializable;

class Person implements Serializable {

    private String name;
    private int age;
    Person (String n, int a){

        name = n;
        age = a;
    }
    String getName(){return name;}
    int getAge(){return age;}
}
