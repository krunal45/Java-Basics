/*
Alright, here's a slightly more advanced question on control flow statements in Java:

Write a Java program that prompts the user to enter their age. Based on their age,
the program should determine and print out their stage of life as follows:
- If the age is less than 18, print "You are a minor."
- If the age is between 18 and 65 (inclusive), print "You are an adult."
- If the age is greater than 65, print "You are a senior citizen."
 */
package main.controlFlow;

import java.util.Scanner;

public class Example1 {

    byte getAge() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age:");
        return input.nextByte();
    }

    String fetchAgeGroup(byte age) {
        if (age < 18)
            return "minor";
        else if (age >= 18 && age <= 65)
            return "adult";
        else
            return "senior citizen";
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();
        System.out.println("You are a " + obj.fetchAgeGroup(obj.getAge()));
    }
}
