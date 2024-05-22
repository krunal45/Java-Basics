/*
Question:
Create a Java program that takes a list of strings as input and counts the frequency of each word in the list.
Then, print out each word along with its frequency.

 */
package MapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example4_220524 {

    static Map<String, Integer> countFrequency(List<String> fruits) {
        Map<String, Integer> map1 = new HashMap<>();
        for (String fruit : fruits) {
            if (map1.containsKey(fruit))
                map1.put(fruit, map1.get(fruit) + 1);
            else
                map1.put(fruit, 1);
        }
        return map1;
    }

 /*
 Way2 :
 Your current implementation has a time complexity of O(n), where n is the number of elements in the list of fruits. This is because you iterate through the list once to count the frequencies.

If you're looking to reduce the time complexity, you can achieve it using Java 8 streams and the `Collectors.groupingBy` collector. Here's how you can do it:

```java
import java.util.*;
import java.util.stream.Collectors;

public class Example4_220524 {

    static Map<String, Long> countFrequency(List<String> fruits) {
        return fruits.stream()
                     .collect(Collectors.groupingBy(
                                 fruit -> fruit,
                                 Collectors.counting()));
    }

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Chickoo", "Apple");
        System.out.println(countFrequency(fruits));
    }
}
```

In this version, `Collectors.groupingBy` groups the elements of the stream by the fruit name, and `Collectors.counting()` counts the occurrences of each fruit. This implementation has the same result as your original code but potentially better performance, especially for large lists, as it leverages the built-in parallelism of streams. The time complexity is still O(n), but it may be more efficient due to internal optimizations of the stream implementation.
  */

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Chickoo", "Apple"));
        System.out.println(countFrequency(fruits));
    }
}
