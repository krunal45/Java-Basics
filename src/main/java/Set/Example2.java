package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Finding unique Elements : You are given an array of integers, and you need to find and return a set containing only the unique elements from the given array.
 In other words, remove duplicates and return the set of distinct elements.
 */
public class Example2 {

    public Set<Integer> findUniqueElements(int[] arr) {
        Set<Integer> nums = new HashSet<>();
        for (int j : arr) {
            nums.add(j);
        }
        return nums;
    }

    public static void main(String[] args) {
        Example2 obj2 = new Example2();
        int[] arr = {1,1,2,3,4,5,6,6};
        System.out.println("Unique Elements in Array :"+ Arrays.toString(arr) +" are : "+obj2.findUniqueElements(arr));
    }

}
