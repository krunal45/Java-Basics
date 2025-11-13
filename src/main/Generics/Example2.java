/*
Here's an intermediate-level Java coding question:

### Question:

**Write a Java program to implement a generic method that finds the middle element of a list.**

- The method should take a list of any type (e.g., `List<T>`) as a parameter.
- The method should return the middle element. If the list has an even number of elements, return the element just before the middle
 (i.e., the element at `size/2 - 1`).
- If the list is empty, return `null`.

For example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
System.out.println(findMiddle(numbers));  // Output: 3

List<String> strings = Arrays.asList("a", "b", "c", "d");
System.out.println(findMiddle(strings));  // Output: "b"
```

### Constraints:
- You must use generics to handle different types of lists.
- Your solution should handle lists of any size, including empty lists.

---

Let me know if you need further clarification!
 */
package main.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {

    static <T> T findMiddle(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        else if (list.size() % 2 == 0) {
            return list.get((list.size() / 2) - 1);
        } else{
            return list.get(list.size() / 2);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Character> alphabets = Arrays.asList('a', 'b', 'c', 'd', 'e');
        List<Character> emptyList = new ArrayList<>();
        System.out.println("Middle number from " + numbers + " is > " + findMiddle(numbers));
        System.out.println("Middle character from " +alphabets+" is > "+findMiddle(alphabets));
        System.out.println("Empty List > "+findMiddle(emptyList));
    }
}

// Code from chat - GPT
//package Generics;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Example2 {
//
//    // Make the method generic
//    static <T> T findMiddle(List<T> list) {
//        if (list.isEmpty()) {
//            return null; // Return null for empty lists
//        }
//        // If list size is even, return the element before the middle
//        else if (list.size() % 2 == 0) {
//            return list.get((list.size() / 2) - 1);
//        } else {
//            // If list size is odd, return the exact middle element
//            return list.get(list.size() / 2);
//        }
//    }
//
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
//        List<Character> alphabets = Arrays.asList('a', 'b', 'c', 'd', 'e');
//        List<Character> emptyList = new ArrayList<>();
//
//        System.out.println("Middle number from " + numbers + " is > " + findMiddle(numbers));
//        System.out.println("Middle character from " + alphabets + " is > " + findMiddle(alphabets));
//        System.out.println("Empty List > " + findMiddle(emptyList));
//    }
//}

