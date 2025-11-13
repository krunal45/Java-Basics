//**Question:**
//You are given an array of integers. Write a Java method to find the **first non-repeating element** in the array.
//If all elements are repeated, return -1.
//
//**Example:**
//Input: `[9, 4, 9, 6, 7, 4]`
//Output: `6`
//
//**Constraints:**
//
//* You may assume the array contains only integers.
//* Try to write a solution with time complexity better than O(n²).
//

package main.Arrays.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class InterviewQuestion1 {

    static Integer findElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check for first non-repeating in original order
        for (int num : nums) {
            if (map.get(num) == 1)
                return num;
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {5, 1, 2, 1, 3, 3, 5, 6};
        System.out.println(findElement(nums));  // Output: 2
    }
}