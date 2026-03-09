package org.example.module83;

import java.util.ArrayList;
import java.util.List;

public class LambdaTask2 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(12);

        System.out.println("Original list:");
        numbers.forEach(n -> System.out.println(n));

        // Remove even numbers
        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("\nOnly odd numbers:");
        numbers.forEach(n -> System.out.println(n));

        // Double odd numbers
        numbers.replaceAll(n -> n * 2);

        System.out.println("\nOdd numbers doubled:");
        numbers.forEach(n -> System.out.println(n));

        // Sum numbers
        final int[] sum = {0};
        numbers.forEach(n -> sum[0] += n);

        System.out.println("\nSum of numbers: " + sum[0]);
    }
}