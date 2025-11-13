package main.interviewQuestions;

import java.util.Arrays;

public class binarySearchArrayExample {


    public static void main(String[] args) {
        int[] nums = new int[32];
        Arrays.sort(nums);
        int target = 13;
        int index = linearSearch(nums, target);
        if (index != -1)
            System.out.println(" Element found at index : " + index);
        else
            System.out.println(" Element not found");

    }

    public static int linearSearch(int[] nums, int target) {
        int count = 0;
        for (int n : nums) {
            count++;
            if (n == target)
                return count;
        }
        System.out.println(" Number of steps : " + count);
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int steps = 0;

        while (start <= end) {
            steps++;
            int median = (start + end) / 2;

            if (nums[median] == target) {
                return median;
            } else if (nums[median] < target) {
                start = median + 1;
            } else {
                end = median - 1;
            }
        }
        System.out.println(" Number of Steps : " + steps);
        return -1;
    }
}
