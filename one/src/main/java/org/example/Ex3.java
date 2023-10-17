package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = random.ints(11, 0, 20).toArray();
        System.out.println("ALL NUMBERS:");
        IntStream.of(nums).forEach(System.out::println);
        System.out.println("FIRST MAX NUMBER:");
        int first = Arrays.stream(nums)
                .max()
                .getAsInt();
        System.out.println(first);
        System.out.println("SECOND MAX NUMBER:");
        int second = Arrays.stream(nums)
                .filter(n -> n < first)
                .max()
                .getAsInt();
        System.out.println(second);

    }
}
