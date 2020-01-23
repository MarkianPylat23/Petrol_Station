package Lecture3;

public class Class {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Object object = new Object();
        }

        System.out.println("I have " + Object.getCount() + " objects");
    }
}
