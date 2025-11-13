/*
Sure! Here's a beginner-level question on lambda expressions in Java:

**Question:**

Given a list of integers, use a lambda expression to filter out and print only the even numbers from the list.
Assume you have a `List<Integer>` named `numbers`. How would you accomplish this using a lambda expression with the `forEach` method?

Feel free to ask if you need any hints or further explanation!
 */
package main.lambda;

import java.util.ArrayList;
import java.util.List;

public class Example03 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        numbers.stream().filter(num -> (num % 2 == 0)).forEach(System.out::println);
    }
}
