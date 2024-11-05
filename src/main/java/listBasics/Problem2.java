/*
Here's an intermediate-level coding question on the `List` concept in Java:

### Question:
Write a Java method that takes a `List<Integer>` as input and returns a new `List<Integer>` containing only the unique elements
from the original list, maintaining the original order. If an element appears more than once, it should only be included once in the result.

### Requirements:
- Use a `List` to store the unique elements.
- Preserve the order of the first occurrence of each element.
- Do not use any additional libraries or data structures other than `List`.

### Example:
```java
Input: [3, 5, 3, 2, 1, 5, 6]
Output: [3, 5, 2, 1, 6]

Input: [1, 2, 2, 3, 4, 4, 4, 5]
Output: [1, 2, 3, 4, 5]
```

### Method Signature:
```java
public List<Integer> getUniqueElements(List<Integer> inputList) {
    // Implementation goes here
}
```

### Notes:
- Consider edge cases like an empty list or a list with all duplicate elements.
 */
package listBasics;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static List<Integer> getUniqueElements(List<Integer> inputList) {
        List<Integer> uniqueList = new ArrayList<>();
        if (inputList.isEmpty()) {
            System.out.println("Input List cannot be empty!");
            return new ArrayList<>();
        } else {
            for (Integer number : inputList) {
                if (!uniqueList.contains(number))
                    uniqueList.add(number);
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 4, 5));
        List<Integer> uniqueList = getUniqueElements(list);
        uniqueList.forEach(number -> System.out.print(number + "\t"));
    }

}
