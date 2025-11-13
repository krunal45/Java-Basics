//Problem Statement
//You are given an array of integers called numbers. Write a Java method called findMaxMin that takes this array as input and returns an array containing two integers: the maximum and minimum values in the array, respectively.


package main.Arrays.OneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class ExampleProblem3 {

    public static int[] findMaxMin(int[] numbers) {
        int[] outputArray = new int[2];
        int maximumNumber = numbers[0], minimumNumber = numbers[0];
        for (int number : numbers) {
            if (maximumNumber < number) {
                maximumNumber = number;
            }
            if (minimumNumber > number) {
                minimumNumber = number;
            }
        }
        outputArray[0] = maximumNumber;
        outputArray[1] = minimumNumber;
        return outputArray;
    }

    public static boolean isLengthOfArrayCorrect(int length) {
        return (length >= 2 && length <= 1000);
    }

    public static boolean isArrayMemberWithinCorrectDataLimit(int number) {
        return (number >= -10000 && number <= 10000);
    }

    public static int[] getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Array. Size of Array should be between 2 ≤ numbers.length ≤ 1000.");
        int size = input.nextInt();
        while (!isLengthOfArrayCorrect(size)) {
            System.out.println("Invalid input. Size of array should be between 2 ≤ numbers.length ≤ 1000.");
            System.out.println("Please Re-Enter Size of Array");
            size = input.nextInt();
        }
        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array. Valid Range is -10000 ≤ numbers[i] ≤ 10000.");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
            while (!isArrayMemberWithinCorrectDataLimit(numbers[i])) {
                System.out.println("Invalid input. Input should be between -10000 ≤ numbers[i] ≤ 10000");
                System.out.println("Please Re-Enter Element");
                numbers[i] = input.nextInt();
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println("Maximum and minimum values in input Array is:" + Arrays.toString(findMaxMin(getUserInput())));
    }

}