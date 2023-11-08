package org.example;

public class Ex1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("xyxy");
            } else if (i % 3 == 0) {
                System.out.println("xxx");
            } else if (i % 5 == 0) {
                System.out.println("yyy");
            }
        }
    }
}