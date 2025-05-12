/*
Given an unsorted array of integers, find the longest consecutive elements sequence.

For example, if the input array is [1, 9, 3, 4, 2, 5, 7, 6, 8], the output should be 10, since the longest consecutive elements sequence is [1, 2, 3, 4, 5, 6, 7, 8].

This problem can be solved in O(n) time and O(1) extra space using a hash set. The following is a pseudocode solution:

def longest_consecutive_sequence(array):
  hash_set = set()
  for element in array:
    hash_set.add(element)

  longest_sequence = 0
  current_sequence = 1
  for element in array:
    if element - 1 not in hash_set:
      current_sequence = 1
    else:
      current_sequence += 1

    longest_sequence = max(longest_sequence, current_sequence)

  return longest_sequence
 */

package Arrays.OneDimensionalArray;

import java.util.HashSet;

import static java.lang.Math.max;

public class ExampleProblem1 {

    static int getSequence(int[] array) {
        HashSet<Integer> nums = new HashSet<>(); // Create a hash set to store the elements of the array.
        int longestSeq = 0; // Initialize the longest sequence variable.
        int currentSeq = 1; // Initialize the current sequence variable.

        for (int num:array){ // Iterate over the array.
            nums.add(num); // Add each element to the hash set.
        }

        for (int num:array){ // Iterate over the array again.
            if (nums.contains(num - 1)){ // If the current element has a predecessor in the hash set, increment the current sequence variable.
                currentSeq +=1;
            }else { // Otherwise, reset the current sequence variable to 1.
                currentSeq = 1;
            }

            longestSeq = max(longestSeq, currentSeq); // Update the longest sequence variable if the current sequence is longer.
        }

        return longestSeq; // Return the longest sequence variable.
    }

    public static void main(String[] args) {
        int[] arr = {2, 1,3,5}; // Declare an array of integers.
        int seq = getSequence(arr); // Call the getSequence() method to find the longest consecutive sequence in the array.
        System.out.println("Sequence: " + seq); // Print the longest consecutive sequence to the console.
    }
}

