
//**Question:**
//
//You are given a `Set<String>` that contains names of employees. Write a method to **remove all names that start with the letter `'A'` or `'a'`
// **, using an **`Iterator`** (not enhanced for-loop or lambda).
//
//---
//
//**Example Input:**
//
//```java
//["Alice", "Bob", "Andrew", "Charlie", "alex", "David"]
//```
//
//**Expected Output:**
//
//```java
//["Bob", "Charlie", "David"]

//### 🔒 Constraints:
//
//* You **must use an `Iterator`** to avoid `ConcurrentModificationException`.
//* You **cannot use `.removeIf()`**, streams, or other lambda-based solutions.

package Set.Questions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        Set<String> employees = new HashSet<>(List.of("Alice", "Bob", "Andrew", "Charlie", "alex", "David"));
        System.out.println("--Before--");
        System.out.println(employees);

        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            if (e.toLowerCase().startsWith("a"))
                iterator.remove();
        }
        System.out.println("--After--");
        System.out.println(employees);
    }
}
