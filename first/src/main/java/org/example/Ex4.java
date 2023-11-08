package org.example;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder(word);
        String reversedWord = sb.reverse().toString();
        if(word.equals(reversedWord)){
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT A PALINDROME");
        }
    }
}