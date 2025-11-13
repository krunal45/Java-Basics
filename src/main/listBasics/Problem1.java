/*
 > Write a Java program to remove all occurrences of a specific element from a given list.
 > Example:

Let's say you have an ArrayList of integers: [1, 2, 3, 4, 2, 5, 2], and you want to remove all occurrences of the element 2.

Your program should modify the list to become: [1, 3, 4, 5], as all occurrences of 2 have been removed.
 */
package main.listBasics;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    static List<Integer> list;

    static List<Integer> removeElement(List<Integer> list, int numberToRemove) {
        list.removeIf(number -> number == numberToRemove);
        return list;
    }

    public static void main(String[] args) {
        list = new ArrayList<>(List.of(1, 2, 3, 4, 2, 5, 2));
        System.out.println("Original > " + list);
        System.out.println("After removing element 2 > " + removeElement(list, 2));
    }
}