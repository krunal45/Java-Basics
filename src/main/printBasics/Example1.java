package main.printBasics;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
//        System.out.print('A');//This line will print character 'A' in the same line
//        System.out.print(" " + 'B');
//        //Now suppose we want to print character 'C' in new line then we can use below command.
//        System.out.println();//This line will move cursor to new Line.
//        System.out.print('C');
        //Let's try to solve below coding questions in 'Java'
//        Java Coding Question: Printing a Pattern
//        Problem Statement:
//        Write a Java program to print the following pattern:
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        The pattern consists of consecutive integers, with each row having one more element than the previous row.
//        Constraints:
//        The program should take an integer n as input, representing the number of rows in the pattern.
//                The program should print the pattern to the console.
//        Example Input/Output:
//        Input: n = 4
//        Output:
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        Your Task:
//        Write a Java program that prints the above pattern based on the input n.
        //1. Taking User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Rows:");
        try {
        int rows = input.nextInt();
        int number = 1;
        for (int rowNumber = 1; rowNumber <= rows; rowNumber++) {
            for (int columnNumber = 1; columnNumber <= rowNumber; columnNumber++) {
                System.out.print(number+"\t");
                number = number + 1;
            }
            System.out.println();
        }}finally {
            input.close();
        }
    }
}