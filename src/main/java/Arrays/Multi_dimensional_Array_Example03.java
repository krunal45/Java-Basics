/*
Problem Statement:
Write a Java method that takes a two-dimensional array of integers as input and returns the sum of all the elements in the array.

1 2
3 4
 */
/*
Okay, let's explore multidimensional arrays in Java! Imagine you're creating a program to store student grades. Each student has grades for multiple subjects.

Here's the question:

* How would you define a multidimensional array in Java to represent these student grades?
 How many dimensions would you use? What data type would you choose for the elements?

Think about how many subjects there are and how many students you want to store grades for.
There are different ways to approach this, so focus on understanding how to use multidimensional arrays to organize data with rows and columns.
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_dimensional_Array_Example03 {

    public static void main(String[] args) {
        int[][] studentMarks = new int[3][3];
        studentMarks[0][0] = 30;
        studentMarks[0][1] = 25;
        studentMarks[0][2] = 35;
        studentMarks[1][0] = 32;
        studentMarks[1][1] = 27;
        studentMarks[1][2] = 33;
        studentMarks[2][0] = 30;
        studentMarks[2][1] = 25;
        studentMarks[2][2] = 35;
        for (int[] subjectMarks : studentMarks) {
            System.out.print(Arrays.toString(subjectMarks) + "\t");
        }
    }

}