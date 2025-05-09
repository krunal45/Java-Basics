// Find 2 numbers in an array that add up to a given target using a hashmap for efficient look ups and return the indices of two numbers
package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class InterviewQuestion2 {

    static int[] findTwoNumbers(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])){
                return new int[] {hashMap.get(target - nums[i]),i};
            }else {
                hashMap.put(nums[i],i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int target = 5;
        System.out.println("Indices > "+ Arrays.toString(findTwoNumbers(nums, target)));
    }
}