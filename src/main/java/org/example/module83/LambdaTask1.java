package org.example.module83;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTask1 {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice", 25, "New York"));
        people.add(new Person("Bob", 30, "London"));
        people.add(new Person("Charlie", 20, "New York"));
        people.add(new Person("David", 35, "Paris"));
        people.add(new Person("Emma", 28, "New York"));

        System.out.println("Original list:");
        people.forEach(p -> System.out.println(p));

        // Sort by age (ascending)
        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("\nSorted by age:");
        people.forEach(p -> System.out.println(p));

        // Filter by city (keep only New York)
        people.removeIf(p -> !p.getCity().equals("New York"));

        System.out.println("\nFiltered by city (New York):");
        people.forEach(p -> System.out.println(p));
    }
}