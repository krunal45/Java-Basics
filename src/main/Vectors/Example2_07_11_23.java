/*
Find the dot product of two vectors in Java.

You are given two vectors, vector1 and vector2, represented as arrays of integers.
 Write a Java program to calculate the dot product of these two vectors and store the result in a variable dotProduct.

 The dot product of two vectors is calculated as follows:
 dotProduct = vector1[0] * vector2[0] + vector1[1] * vector2[1] + ... + vector1[n-1] * vector2[n-1]
 For example, if vector1 is [1, 2, 3] and vector2 is [4, 5, 6], the dotProduct should be 1*4 + 2*5 + 3*6 = 32.

 */

package main.Vectors;

import java.util.Arrays;
import java.util.Vector;

public class Example2_07_11_23 {

    static int getDotProductOfVectors(Vector<Integer> vector1, Vector<Integer> vector2) {
        int sum =0;
        if (vector1.size() == vector2.size()) {
            for (int i = 0; i < vector1.size(); i++) {
                sum = sum + (vector1.get(i) * vector2.get(i));

            }
        } else {
            System.out.println("Fail: Cannot calculate dot product of vectors since vector size is different!");
            return 0;
        }
        return sum;
    }

    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>(Arrays.asList(1,2,3));
        Vector<Integer> vector2 = new Vector<>(Arrays.asList(2,3,4));
        int sum = getDotProductOfVectors(vector1, vector2);
        if (sum!=0)
            System.out.println("Dot product of vectors "+vector1+" and "+vector2+" is :"+getDotProductOfVectors(vector1, vector2));
    }

}
