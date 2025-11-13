package main.practice23rdAug;

import java.util.Arrays;

public class MultidimensionalArrayExample {
//    Replace Row values with column values.
//      1 2   1 3  1 2 3
//      3 4   2 4  4 5 6

    int[][] transposeMatrix(int[][] input) {
        int actualRows = input.length;
        int actualCols = input[0].length;
        int newRows = actualCols;
        int newCols = actualRows;
        int[][] outArr = new int[newRows][newCols];

        for (int col = 0; col < newCols; col++) {
            for (int row = 0; row < newRows; row++) {
                outArr[row][col] = input[col][row];
            }
        }
        return outArr;
    }

    public static void main(String[] args) {
        MultidimensionalArrayExample obj1 = new MultidimensionalArrayExample();
        int[][] matrix1 = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}, {9, 10, 11}};
        System.out.println("--Before Transpose--");
        for (int[] ints : matrix1) {
            System.out.print(Arrays.toString(ints));
            System.out.print("\n");
        }
        System.out.println("--After Transpose--");
        int[][] outMatrix1 = obj1.transposeMatrix(matrix1);
        for (int[] ints : outMatrix1) {
            System.out.print(Arrays.toString(ints));
            System.out.print("\n");
        }
    }
}
