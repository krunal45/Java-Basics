/*
Sure! Here's another beginner-level question based on the concept of **Lambda Expressions** in Java:

### Question:
Write a Java program that uses a lambda expression to filter out all numbers from a list that are divisible by 3,
and then prints the remaining numbers.

### Example:

Input:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
```

Output:
```
1 2 4 5 7 8 10
```

### Hint:
- You can use `List.stream()` to filter elements using a lambda expression that checks divisibility by 3. Use `filter()`
 to exclude numbers that are divisible by 3.

Let me know if you need help with the solution!
 */
package lambda;

import java.util.List;

public class Example05 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Before filter > " + numbers);
        numbers = numbers.stream().filter(number -> number % 3 != 0).toList();
        System.out.print("Number not divisible by 3 are -> "+numbers);
    }
}