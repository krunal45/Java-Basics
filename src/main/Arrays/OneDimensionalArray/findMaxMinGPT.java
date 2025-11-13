//Problem Statement
//You are given an array of integers called numbers. Write a Java method called findMaxMin that takes this array as input and returns an array containing two integers: the maximum and minimum values in the array, respectively.



package main.Arrays.OneDimensionalArray;

import java.util.Arrays;

public class findMaxMinGPT {

    public static int[] findMaxMin(int[] numbers){
     int[] outputArray = new int[2];




     return outputArray;



     /*
     1. Iterate over all the elements in arry
      */
    }

    public static boolean checkLengthOfArray(int length){
        return (length >=2 && length <= 1000);
    }

    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 1};
        System.out.println("Input Array is:"+ Arrays.toString(numbers));
        System.out.println("Maximum and minimum values in input Array is:"+ Arrays.toString(findMaxMin(numbers)));
    }

}