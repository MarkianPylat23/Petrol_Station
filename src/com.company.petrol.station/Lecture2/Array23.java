package com.company.petrol.station.Lecture2;

import java.util.Scanner;

public class Array23 {
    public static void main(String[] args) {

        int n = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter numbers of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            for (int e = 0; e < a.length; e++) {
                if (a[i] == (a[e])) {
                    a[e] = 0;
                }
            }
        }
    }
}
