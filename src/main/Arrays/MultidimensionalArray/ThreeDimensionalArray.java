package main.Arrays.MultidimensionalArray;

import java.util.Arrays;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int[][][] threeDimensionalArray = new int[2][2][2];
        threeDimensionalArray[0][0][0] = 1;
        threeDimensionalArray[0][0][1] = 2;
        threeDimensionalArray[0][1][0] = 3;
        threeDimensionalArray[0][1][1] = 4;
        threeDimensionalArray[1][0][0] = 5;
        threeDimensionalArray[1][1][0] = 6;
        threeDimensionalArray[1][1][1] = 7;
        threeDimensionalArray[1][0][1] = 8;
        System.out.println(Arrays.deepToString(threeDimensionalArray));
    }
}
