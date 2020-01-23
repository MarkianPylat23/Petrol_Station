package Destroyers;

public class Main {
    public static void main(String[] args) {

        Destroyer Destroyer1 = new Destroyer();
        System.out.println(Destroyer1.model1);
        Destroyer1.start1();

        System.out.println("\n ================== \n");

        Destroyer Destroyer2 = new Destroyer();
        System.out.println(Destroyer2.model2);
        Destroyer2.start2();
    }
}
