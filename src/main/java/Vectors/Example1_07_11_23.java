/*
Question 1: Calculate the sum of two vectors in Java.

        You are given two vectors, vector1 and vector2, represented as arrays of integers.
        Write a Java program to calculate the sum of these two vectors and store the result in a third vector, sumVector.

        For example, if vector1 is [1, 2, 3] and vector2 is [4, 5, 6], the sumVector should be [5, 7, 9].

 */

package Vectors;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Example1_07_11_23 {

    static Vector<Integer> getSumOfVectors(Vector<Integer> vector1, Vector<Integer> vector2) {
        Vector<Integer> sum = new Vector<>();
        if (vector1.size() == vector2.size()) {
            for (int i = 0; i < vector1.size(); i++) {
                sum.add(i, (vector1.get(i) + vector2.get(i)));
            }
        } else {
            System.out.println("Size of vector1 and vector2 is different. Cannot calculate the sum!");
        }
        return sum;
    }

    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>(Arrays.asList(1, 2, 3, 4));
        Vector<Integer> vector2 = new Vector<>(Arrays.asList(2, 3, 4, 5, 6));
        System.out.println("Sum of vectors " + vector1 + " and " + vector2 + " is :" + getSumOfVectors(vector1, vector2));
    }
}