package com.company.petrol.station.Lecture2;

public class Example {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 3, 1, 4, 2, 8, 3};

        System.out.print("Result: ");
        int i,x;
        for (i = 0; i < array.length; i++) {
            for (x = 1 + i; x < array.length; x++){
                if(array[i].equals(array[x])){
                    array[x] = 0;
                }
            }

            System.out.print(array[i] + " ");
        }
    }
}
