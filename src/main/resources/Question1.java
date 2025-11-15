//### 🔹 **Interview Question:**
//
//**"Given a list of strings, write a Java method that returns a `Map<String, Integer>` where the key is the string,
// and the value is the number of times that string appears in the list."**
//### 💡 **Example:**
//
//**Input:**
//
//```java
//["apple", "banana", "apple", "orange", "banana", "apple"]
//```
//
//**Output:**
//
//```java
//{apple=3, banana=2, orange=1}
//```
//
//---
//
//### 🧠 **Follow-up Discussion (optional in interview):**
//
//* How would you sort the map by values (frequency)?
//* What if you had to preserve the order of first appearance?
//* Can this be optimized using Java 8 features like streams?

package main.MapConcept.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "apple"));
        Map<String,Integer> fruitsCount = new HashMap<>();

        for (String fruit:fruits){
            if (fruitsCount.containsKey(fruit))
                fruitsCount.put(fruit, fruitsCount.get(fruit)+1);
            else
                fruitsCount.put(fruit, 1);
        }
        System.out.println(fruitsCount);
    }
}