package com.company.petrol.station.Lesson9;

import java.util.Random;

public class Task5{
    public static void main(String[] args) {
        int height = 10;
        int width = 5;
        int[][] array2 = new int[height][width];
        int max;
        max = array2[0][0];
        Random random = new Random();
        for ( int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array2[i][j] = random.nextInt(99) + 2;
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
    }
        System.out.println("=========");

       int sum = 0;

        for (int i=0; i<10; i++){
            for (int j=0; j<array2[i].length; j++){
                sum = sum + array2[i][j];
                if (max < array2[i][j])
                max = array2[i][j];
                sum = max;
            }
        }
        System.out.println(sum);
    }
}
