package finished.project.in.java;

import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to our shop!\n " +
                "please select product: Drinks, Sweets, Snacks or press 0 to exit.\n");
        String s = scanner.nextLine();
        System.out.println(s);    }
}


