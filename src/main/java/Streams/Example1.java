package Streams;

/*
Problem Statement: You have a list of integers,
and you need to find the average of all the even numbers in the list using Java Streams.
Write a Java method that takes a List of integers as input and returns the average of all even numbers in the list.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {

    double getAverageOfNumbersInList(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers.stream().filter(n -> (n % 2 == 0)).toList();
        int evenNumbersSum = evenNumbers.stream().reduce(0, Integer::sum);
        return (double) evenNumbersSum / evenNumbers.size();
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();
        double average = obj.getAverageOfNumbersInList(new ArrayList<>(Arrays.asList(2, 4, 5, 6, 8, 1)));
        System.out.println("Average of Even Numbers in list is : " + average);
    }
}
