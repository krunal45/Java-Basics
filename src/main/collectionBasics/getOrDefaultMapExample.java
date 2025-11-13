/*
This class contains example to understand usage of getOrDefaultMap() of Map interface
 */
package main.collectionBasics;

import java.util.*;

public class getOrDefaultMapExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Chickoo", "Dragon", "Cherry", "Apple", "Banana");
        Map<String, Integer> fruitsFrequency = new HashMap<>();
        for (String fruit : fruits)
            fruitsFrequency.put(fruit, (fruitsFrequency.getOrDefault(fruit, 0)) + 1);
        fruitsFrequency.forEach((k, v) -> System.out.println("fruit:" + k + " frequency:" + v));
    }
}