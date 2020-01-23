package Lecture1;

import java.util.Arrays;
import java.util.Collections;

public class Task_3 {
    public static void main(String[] args) {
        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};

        System.out.println("Array: " + arr);
        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }

}
