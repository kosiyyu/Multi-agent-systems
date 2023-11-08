package org.example;

import java.util.Scanner;

public class Ex8 {
    public static double toLandMiles(double km) {
        return km * 0.62;
    }

    public static double tooSeaMiles(double km) {
        return km * 0.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double km = Double.parseDouble(sc.nextLine());
        System.out.println("Distance in land miles: " + toLandMiles(km));
        System.out.println("Distance in sea miles: " + tooSeaMiles(km));
    }
}