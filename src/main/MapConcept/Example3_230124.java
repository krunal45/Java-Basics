/*
Question: Finding Duplicate Elements

Write a Java program to find and display duplicate elements in an array of integers. You need to use a Map to efficiently solve this problem. The program should take an array of integers as input and print the duplicate elements along with their frequencies.

For example, if the input array is: [1, 2, 3, 2, 4, 5, 6, 1, 3], the output should be something like:

Duplicate elements in the array:
1 - 2 times
2 - 2 times
3 - 2 times
 */


package main.MapConcept;

import java.util.HashMap;
import java.util.Map;

public class Example3_230124 {
    static Map<Integer, Integer> map1 = new HashMap<>();

    static Map<Integer, Integer> findDuplicateElements(int[] input) {

        Map<Integer, Integer> duplicateElements = new HashMap<>();
        for (int key : input) {
            if (map1.containsKey(key)) {
                int count = map1.get(key);
                map1.put(key, ++count);
            } else {
                map1.put(key, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateElements.put(entry.getKey(), entry.getValue());
            }
        }
        return duplicateElements;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map2 = findDuplicateElements(new int[]{1, 2, 3, 2, 1, 5, 2, 1, 3});
        System.out.println("Duplicate Elements are :" + map2);
    }
}
