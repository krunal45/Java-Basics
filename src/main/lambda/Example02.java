/*
Sure! Here's a beginner-level coding question for you:

Write a Java program that uses lambda expressions to filter a list of strings.
The program should filter out strings that start with the letter 'A' and print the remaining strings.
 */
package main.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example02 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Chickoo"));
        System.out.println("---Before filter---");
        fruits.forEach(System.out::println);
        System.out.println("---After filter---");
        fruits = fruits.stream().filter(fruit -> fruit.charAt(0) != 'A').collect(Collectors.toList());
        fruits.forEach(System.out::println);
    }
}
