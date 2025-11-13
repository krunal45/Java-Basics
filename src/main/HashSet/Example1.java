/*
Sure, here's a beginner-level coding question on HashSet in Java:

Write a Java program that creates a HashSet of integers and adds the numbers 1 through 5 to it.
Then, iterate over the HashSet and print each element.

 */
package main.HashSet;

import java.util.HashSet;

public class Example1 {

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.forEach(System.out::println);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of "+numbers+" is :"+sum);
        int product = numbers.stream().reduce(1, Math::multiplyExact);
        System.out.println("Product of "+numbers+" is :"+product);
    }
}
