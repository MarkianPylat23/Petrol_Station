package Lecture2;

public class ReplacedArray {
    public static void main(String[] args) {

        int[] array = {3, 2, 3, 1, 4, 2, 8, 3};
        System.out.println("Our array: ");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            for (int a = 1 + i; a < array.length; a++) {
                if (array[i] == (array[a])) {
                    array[a] = 0;
                }
            }
        }
        System.out.println("\n");
        System.out.println("Replaced array: ");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}