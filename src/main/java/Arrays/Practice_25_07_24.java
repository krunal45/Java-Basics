/*
Sure, here's a coding question involving arrays:

Write a Java method that takes in an integer array and returns true if the array is sorted in non-decreasing order
(i.e., each element is less than or equal to the next element), and false otherwise.

Feel free to give it a try, and we can discuss your approach and how you would implement it!
 */
package Arrays;

import java.util.Arrays;

public class Practice_25_07_24 {

    boolean isArraySorted(int[] array) {
        boolean[] status = new boolean[array.length - 1];
        boolean arraySorted = false;
        for (int i = 0; i < array.length - 1; i++) {
            status[i] = array[i] <= array[i + 1];
        }

        for (int i = 0; i < status.length; i++) {
            arraySorted = status[i] && status[++i];
        }
        return arraySorted;
        //Need to debug value of arraySorted;
    }

    public static void main(String[] args) {
        Practice_25_07_24 instance1 = new Practice_25_07_24();
        int[] arr1 = {1, 2, 1};
        System.out.println(Arrays.toString(arr1) + " is :" + instance1.isArraySorted(arr1));
    }

}