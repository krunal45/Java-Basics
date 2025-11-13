//### 🔹 **Interview Question:**
//**"Write a Java method that rotates a list of integers to the right by `k` steps."**
//
//#### Example:
//```java
//Input: list = [1, 2, 3, 4, 5, 6, 7], k = 3
//Output: [5, 6, 7, 1, 2, 3, 4]
//```
//
//---
//
//### 💡 **Constraints:**
//- Try to do it in-place if possible.
//- Consider edge cases like `k` being greater than the size of the list.

package main.collectionBasics.Questions;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 4));
        int k = 1;
        int stepMoved = 0;
        int temp;
        for (int i = 0; i < nums.size(); i++) {
            if (k > nums.size()) {
                System.out.println("No of steps cannot be greater than list size i.e " + nums.size());
                break;
            }
            temp = nums.get(i + k);
            nums.add(i + k, nums.get(i));
        }

    }
}
