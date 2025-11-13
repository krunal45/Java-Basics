/*
Sure, here's a beginner-level coding question based on the concept of a sorted set:

Write a function in your preferred programming language that takes in a sorted set of integers and a target integer.
The function should return `True` if the target integer is present in the sorted set, and `False` otherwise.
 */
package main.sortedSet;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example1 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Set.of(10, 2, 3, 4, 15, 1, 7));
        System.out.println("Before sort > " + numbers);
        SortedSet<Integer> sortedNumbers = new TreeSet<>();
        sortedNumbers.addAll(numbers);
    }
}
