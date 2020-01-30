package com.company.petrol.station.Petrol_Station;

public class Main {
    public static void main(String[] args) {

        Car Volkswagen = new Car();
        System.out.println("Welcome to Volkswagen");
        System.out.println(Volkswagen.start);
        System.out.println(Volkswagen.go);
        System.out.println("Speed is - " + Volkswagen.speed);
        System.out.println(Volkswagen.stop);
    }
}
