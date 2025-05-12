/*
Write a Java program to find the maximum element in an array.

 */
package Arrays.OneDimensionalArray;

import java.util.Arrays;

public class FindMaximumElementinArray {

    static char findMaximumElement(char... input) {
        char max = input[0];
        for (char c : input) {
            if (c > max) {
                max = c;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        char[] characters = {'q', 'a', 'p', 'r', 'a', 'y', 'o', 'g', 's', 'h', 'a', 'l', 'a'};
        System.out.println("Maximum element in "+ Arrays.toString(characters) +" is :"+ findMaximumElement(characters));
    }
}
