package main.practice23rdAug;

public class ArrayExample1 {

    int findMax(int... nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    int findMin(int... nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayExample1 obj = new ArrayExample1();
        int[] nums = {121, 233, 1, 2, 45, 91};
        int maxNum = obj.findMax(nums);
        int minNum = obj.findMin(nums);
        System.out.println("Max Number is :" + maxNum);
        System.out.println("Min Number is :" + minNum);
    }
}