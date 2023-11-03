/*
Given an array of integers, find the equilibrium index. An equilibrium index of an array is an index such that the sum of the elements at the lower indexes is equal to the sum of the elements at the higher indexes.

For example, if the input array is [1, 3, 5, 2, 1], the output should be 3, since the sum of the elements at the lower indexes (1 + 3) is equal to the sum of the elements at the higher indexes (2 + 1).

This problem can be solved in O(n) time and O(1) extra space using two pointers. The following is a pseudocode solution:

def equilibrium_index(array):
  left_sum = 0
  right_sum = sum(array)

  for i in range(len(array)):
    right_sum -= array[i]
    if left_sum == right_sum:
      return i

    left_sum += array[i]

  return -1
 */
package Arrays;

import java.util.Arrays;

public class ExampleProblem2 {

    static int getEquilibiriumIndex(int[] array) {
        int lowerIndexSum = 0; // Initialize the lower index sum variable.
        int higherIndexSum = 0; // Initialize the higher index sum variable.
        int equilibiriumIndex = (array.length - 1) / 2; // Initialize the equilibrium index variable.

        for (int i = 0; i < ((array.length - 1) / 2); i++) { // Iterate over the array from the beginning to the equilibrium index.
            lowerIndexSum = array[i] + lowerIndexSum; // Add each element to the lower index sum.
        }

        for (int i = ((array.length - 1) / 2) + 1; i < array.length; i++) { // Iterate over the array from the equilibrium index to the end.
            higherIndexSum = array[i] + higherIndexSum; // Add each element to the higher index sum.
        }

        if (lowerIndexSum == higherIndexSum) { // If the lower index sum is equal to the higher index sum, then the equilibrium index is the equilibrium index variable.
            return equilibiriumIndex;
        } else { // Otherwise, the equilibrium index is -1.
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 1, 2}; // Declare an array of integers.
        System.out.println("Equilibiurium Index for :" + Arrays.toString(arr) + " is :" + getEquilibiriumIndex(arr)); // Print the equilibrium index to the console.
    }

}

