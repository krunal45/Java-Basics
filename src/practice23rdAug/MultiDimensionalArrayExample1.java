package practice23rdAug;

import java.util.Arrays;

public class MultiDimensionalArrayExample1 {

    void traverseMatrixSpirally(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < arr[0].length; col++) {
                    System.out.print(arr[row][col] + "\t");
                }
            } else {
                for (int col = arr[0].length - 1; col >= 0; col--) {
                    System.out.print(arr[row][col] + "\t");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] inputArray = {{1, 2, 3, 4}, {4, 5, 1, 1}, {2, 1, 1, 1}, {2, 3, 1, 3}, {1, 0, 0, 0}};
        System.out.println("--Input array--");
        for (int[] arr : inputArray) {
            System.out.print(Arrays.toString(arr) + "\t");
            System.out.print("\n");
        }
        System.out.println("--Spiral Array--");
        MultiDimensionalArrayExample1 obj1 = new MultiDimensionalArrayExample1();
        obj1.traverseMatrixSpirally(inputArray);
    }
}
