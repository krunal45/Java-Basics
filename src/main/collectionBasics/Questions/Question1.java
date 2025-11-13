//**Question:**
//
//Write a method in Java that takes a `List<Integer>` as input and returns a new `List<Integer>` containing only the elements
// that appear **more than once**, preserving the **original order** of their **first duplicate appearance**.
//
//**Example:**
//
//```java
//Input: [4, 5, 6, 7, 4, 5, 8, 9, 4]
//Output: [4, 5]
//```
//
//**Constraints:**
//- Do not use any third-party libraries.
//- Optimize for time and space complexity.

package main.collectionBasics.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(4, 5, 6, 7, 4, 5, 8, 9, 4));
        List<Integer> duplicateNums = new ArrayList<>();
        Map<Integer, Integer> numsCount = new HashMap<>();
        for (int num : nums) {
            numsCount.merge(num, 1, Integer::sum);
        }
        System.out.println(numsCount);

        for (int n : nums) {
            if (numsCount.get(n) > 1) {
                if (!duplicateNums.contains(n)) {
                    duplicateNums.add(n);
                }
            }
        }
        System.out.println(duplicateNums);
    }
}