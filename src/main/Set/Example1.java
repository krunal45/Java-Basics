package main.Set;

/*
Set Intersection : You are given two arrays of integers, arr1 and arr2.
Your task is to find and return the intersection of the two arrays, i.e., the set of elements that are common to both arr1 and arr2.
 */

import java.util.HashSet;
import java.util.Set;

public class Example1 {

    public Set<Integer> findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> commonNums = new HashSet<>();
        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i) {
                    commonNums.add(i);
                }
            }
        }
        return commonNums;
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        int[] arr1 = {1, 2, 4, 2, 3, 5};
        int[] arr2 = {2, 3, 1, 5};
        System.out.println("Common Numbers are : " + example1.findIntersection(arr1, arr2));
    }

}