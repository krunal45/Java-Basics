/*
Here's a beginner-level coding question on `ArrayList`:

**Question:**

Write a Java program that takes a list of integers (using `ArrayList`) and performs the following tasks:

1. Add 5 integers to the `ArrayList` from user input.
2. Print the `ArrayList`.
3. Find and print the largest number in the `ArrayList`.
4. Remove the largest number from the `ArrayList`.
5. Print the `ArrayList` again after removing the largest number.

Good luck! Let me know if you need help later.
 */
package main.collectionBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice081124 {

    static ArrayList<Integer> userInput() {
        Scanner input = new Scanner(System.in);
        int i = 0, number = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < 5) {
            System.out.println("Please Enter number:");
            try {
                number = input.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input!");
                System.out.println(e.getMessage());
                input.next();  // Consume the invalid input
            }
            list.add(number);
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = userInput();
        System.out.println("Initial List: " + list);

        int max = list.get(0);
        int maxIndex = 0;

        // Find the largest number and its index
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                maxIndex = i;
            }
        }

        System.out.println("Largest number: " + max);

        // Remove the largest number using its index
        list.remove(maxIndex);
        System.out.println("Final list after removing largest number: " + list);
    }
}