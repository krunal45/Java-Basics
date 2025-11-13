/*
Here's a coding problem for you:

You are given a list of integers. Write a function that takes this list as input and returns a new list containing only the
unique even numbers. You can use any collection classes from the Java Collections Framework to solve this problem.

 */
package main.collectionBasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example1 {

    public static Set<Integer> getUniqueEvenNumbers(List<Integer> list) {
        Set<Integer> set1 = new HashSet<>(list);
        set1 = set1.stream().filter(num -> num % 2 == 0).collect(Collectors.toSet());
        return set1;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(2, 3, 4, 5, 6, 7, 8, 10, 11, 13, 16, 2, 3));
        System.out.println("Unique Even Numbers from: " + list1 + " is :" + getUniqueEvenNumbers(list1));
    }
}
