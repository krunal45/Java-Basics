//❓ Question 1: Reverse a String
//Write a Java method that takes a String as input and returns the reversed version of it.
//You can use any Java utilities or do it manually.

package main.interviewQuestions.April24;

import java.util.Scanner;

public class ReverseString {
    static String reverse(String input) {
        StringBuilder reversedString = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString.append(input.charAt(i));
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String name = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide String input: ");
        name = input.next();
        System.out.println("Output > " + reverse(name));
    }
}