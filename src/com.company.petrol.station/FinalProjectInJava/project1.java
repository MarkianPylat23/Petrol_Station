package com.company.petrol.station.FinalProjectInJava;

import java.io.InputStreamReader;
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        System.out.println("Hello, please select petrol: 95, 94, 100, press 0 to exit.");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number == 0){
            System.out.println("Thank you, goodbye");
        }else{
            System.out.println("You select " + number + " petrol");
            System.out.println("How much litrs do you want? ");
            Scanner scan1 = new Scanner(System.in);
            int number1 = scan1.nextInt();
            System.out.println("You want " + number1 + " litrs");
            if (number == 95) {
                System.out.println("You shoud pay " + number1 * 32 + " grivnas");
            }
            if (number == 94) {
                System.out.println("You shoud pay " + number1 * 28 + " grivnas");
            }
            if (number == 100) {
                System.out.println("You shoud pay " + number1 * 23 + " grivnas");
            }
            System.out.println("Thank you, goodbye");
        }
    }
}