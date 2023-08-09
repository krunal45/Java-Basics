package interviewQuestions;

import java.util.Arrays;

public class ArraysExample1 {
    public static void main(String[] args) {
        int[][] nums = new int[2][3];
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                nums[row][column] = (int) (Math.random() * 10);
//                System.out.print(nums[row][column] + " ");
            }
//            System.out.println();
        }

        for (int[] num : nums) {

            for (int j : num) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}