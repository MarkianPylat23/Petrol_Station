package Lesson3;

import java.util.*;
import java.util.stream.Collectors;

public class Aplication1 {
    public static void main(String[] args) {
        List<String> food = Arrays.asList("Banana", "Apple", "Banana", "Orange", "Apple", "Apple", "Apple");
        List<String> drinks = Arrays.asList("Water", "Beer", "Whisky");
        List<String> elektroniks = Arrays.asList("Computer", "HardDrive", "FlashMemory");

        Shop shop = new Shop(food, drinks, elektroniks);

        Set<String> unikFood = new HashSet<>(food);

        int size = 0;
        for (String product : food) {
            int length = product.length();
            System.out.println(length);
            size = size + length;
        }

        int sum = food.stream().mapToInt(s -> s.length()).sum();

        System.out.println(size);
        System.out.println(sum);
    }
}
