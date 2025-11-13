//### 🧠 **Question:**
//Java provides a built-in functional interface called `Predicate<T>`.
// Write a Java program that uses `Predicate<String>` to filter a list of strings and print only those that start with the
// letter **"A"** and have a length greater than **3**.
//
//#### 💡 Requirements:
//- Use a `List<String>` with at least 5 sample strings.
//- Use a `Predicate<String>` to define the filtering condition.
//- Use Java 8+ features like `stream()` and `filter()`.

package main.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {
        Predicate<String> filterString = s -> s.startsWith("A") && s.length() > 3;
        List<String> stringList = new ArrayList<>(List.of("Ajay", "Adam", "Apple", "Banana", "Ave"));
        System.out.println("--input-- > "+stringList);
        System.out.println("--Strings starting with letter A--");
        List<String> stringsStartingWithLetterA = stringList.stream().filter(filterString).toList();
        stringsStartingWithLetterA.forEach(System.out::println);
    }
}