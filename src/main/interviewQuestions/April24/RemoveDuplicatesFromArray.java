//❓ Question 2: Remove Duplicates from Array
//Write a Java method that removes duplicate integers from an array and returns a new array with only unique values (preserve order if possible).

package main.interviewQuestions.April24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    static Integer[] removeDuplicates(int[] nums) {
        Set<Integer> seen = new LinkedHashSet<>();
        for (int num : nums) {
            seen.add(num);
        }
        return seen.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 2};
        System.out.println("Unique Array > " + Arrays.toString(removeDuplicates(nums)));
    }
}
