package com.company.petrol.station.Destroyers;

public class Destroyer {
    public int speed1 = 300;

    public int speed2 = 350;

    public int height1 = 5000;

    public int height2 = 5000;

    public int NumbersOfRockets1 = 50 ;

    public int NumbersOfRockets2 = 30 ;

    public int ValueOfEngine1 = 12;

    public int ValueOfEngine2 = 10;

    public String TypeOfEngine1 = "reactive TR-1";

    public String TypeOfEngine2 = "reactive ST-2";

    public String model1 = "CY-15" ;

    public String model2 = "F-14";


    public void start1(){
        takeoff();
        System.out.println("Plane has taken off");
        System.out.println("The speed of plane is " + speed1 + " km/h" );
        System.out.println("Plane has height " + height1 + " meters");
        System.out.println("The type of engine is " + TypeOfEngine1 + " and value "+ ValueOfEngine1);
        launchrockets();
        System.out.println("Plane launched "+ NumbersOfRockets1 + " rockets");
        landing();
        System.out.println("Plane has landed");

    }

    public void start2(){
        takeoff();
        System.out.println("Plane has taken off");
        System.out.println("The speed of plane is " + speed2 + " km/h");
        System.out.println("Plane has height " + height2 + " meters");
        System.out.println("The type of engine is " + TypeOfEngine2 + " and value "+ ValueOfEngine2);
        launchrockets();
        System.out.println("Plane launched "+ NumbersOfRockets2 + " rockets");
        landing();
        System.out.println("Plane has landed");

    }

    public void takeoff(){

    }

    public void launchrockets(){

    }

    public void landing(){

    }

}
