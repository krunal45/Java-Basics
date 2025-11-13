//        **Question:**
//
//You are given a list of integers which may contain duplicates. Write a Java method to **return a new list containing only the unique elements**
// from the original list, in the same order they first appeared.
//
//Use a `Set` to help achieve this.

//        **Example:**
//
//        ```java
//Input: [4, 5, 4, 6, 7, 5, 8]
//Output: [4, 5, 6, 7, 8]

//        **Follow-up:**
//
//        1. What is the time complexity of your approach?
//        2. What type of `Set` will you use to maintain insertion order?
//
//        ---
package main.Set.Questions;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4, 5, 4, 6, 7, 5, 8));
        System.out.println("--Before--");
        System.out.println(numbers);
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
        System.out.println("--After--");
        System.out.println(uniqueNumbers);
    }
}