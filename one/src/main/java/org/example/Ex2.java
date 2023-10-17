package org.example;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int random = new Random().nextInt(100) + 1;
        int count = 0;
        System.out.println(random);
        int enterNumber = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("GUESS A NUMBER");
        while(enterNumber != random){
            count++;
            try{
                enterNumber = Integer.parseInt(sc.nextLine());
            }
            catch (Exception e){
                System.out.println("NOT A NUMBER");
            }
            System.out.println("TRY AGAIN");
        }
        sc.close();
        System.out.println("U GUESSED A NUMBER!!! TOTAL ATTEMPTS: " + count);
    }
}