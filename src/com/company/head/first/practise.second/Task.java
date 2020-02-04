package com.company.head.first.practise.second;

public class Task {
    public int greenTicket() {
        int a = 3;
        int b = 1;
        int c = 2;

        if (a != b && a != c && b != c) {
            System.out.println("0");
        } else if (a == b && a == c && b == c) {
            System.out.println("20");
        } else if (a == b && a != c && b != c) {
            System.out.println("10");
        } else {
            System.out.println("You're done");
        }
        return 0;
    }
}
