/*
Sure! Here's a beginner-level coding question on the 'Lambda' concept in Java:

### Question:
Write a Java program using a lambda expression to implement a `Comparator` that compares two strings based on their lengths.
The program should sort an array of strings in ascending order by their length.

### Example:

Input:
```java
String[] words = {"apple", "banana", "kiwi", "grape", "pear"};
```

Output:
```java
kiwi, pear, apple, grape, banana
```

### Hint:
- You can use `Arrays.sort()` with a custom `Comparator` implemented as a lambda expression.

 */
package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Example04  {
    public static void main(String[] args) {
        String[] fruits = {"kiwi","Dragon","Apple","Banana","Chickoo"};
        Arrays.sort(fruits, Comparator.comparingInt(String::length));
        for (String fruit:fruits){
            System.out.println(fruit);
        }
    }
}