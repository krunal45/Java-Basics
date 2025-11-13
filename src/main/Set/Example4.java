/*
Question: Write a Java method that takes two Sets of integers as input and
 returns a new Set containing the intersection of the two input Sets, without using any built-in Set intersection methods like `retainAll()`.

Feel free to ask if you need any clarification or guidance!
 */
package main.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example4 {

    static Set<Integer> getCommonElements(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> commonSet = new HashSet<>();
        for (int i : set1) {
            for (int j : set2) {
                if (i == j)
                    commonSet.add(i);
            }
        }
        return commonSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
        System.out.println("Common elements between " + set1 + " and " + set2 + " is:" + getCommonElements(set1, set2));
    }
}
