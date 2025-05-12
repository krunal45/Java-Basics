/*
Problem Statement:
Write a Java method that takes a two-dimensional array of integers as input and returns the sum of all the elements in the array.

1 2
3 4
 */
package Arrays.MultidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_dimensional_Array_Example02 {

    // int[][] arr1 = {{1,2}};
    public static int[][] getUserInput() {
        int inputRow, inputColumn;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter number of Rows for Array :");
        inputRow = input.nextInt();
        System.out.println("Please Enter number of Columns for Array :");
        inputColumn = input.nextInt();
        int[][] arr1 = new int[inputRow][inputColumn];
        for (int row = 0; row < inputRow; row++) {
            for (int column = 0; column < inputColumn; column++) {
                arr1[row][column] = input.nextInt();
            }
        }
        return arr1;
    }

    public static int getArraySum(int[][] input) {
        int sum = 0;
        for (int row = 0; row < input[row].length; row++) {
            for (int column = 0; column < input[column].length; column++) {
                sum = sum + input[row][column];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arrayInput = getUserInput();
        System.out.println("Sum of Input Array " + Arrays.deepToString(arrayInput) + "is :" + getArraySum(arrayInput));
    }
}
