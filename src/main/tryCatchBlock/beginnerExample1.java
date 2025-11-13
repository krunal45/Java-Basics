/*
Sure! Here's a beginner-level coding question involving the `try-catch` block:

Write a Java program that prompts the user to enter two numbers. Use a `try-catch` block to catch any `InputMismatchException`
that may occur if the user enters something other than a number. If an exception is caught, display an error message "Invalid input.
Please enter numbers only." Otherwise, display the sum of the two numbers entered by the user.

Feel free to give it a try!
 */
package main.tryCatchBlock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class beginnerExample1 {
    private static Scanner input = new Scanner(System.in);
    float number1, number2;
    float[] numbers;

    private float[] getNumbers() {
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Please enter 2 numbers");
                number1 = input.nextFloat();
                number2 = input.nextFloat();
                numbers = new float[]{number1, number2};
                validInput = true;
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid input. Please enter numbers only.");
            }
        }
        return numbers;
    }

    private float addNumbers(float[] numbers) {
        float sum = 0;
        if (numbers != null)
            for (float i : numbers)
                sum += i;
        return sum;
    }

    public static void main(String[] args) {
        beginnerExample1 instance1 = new beginnerExample1();
        System.out.println("Sum: " + instance1.addNumbers(instance1.getNumbers()));
        input.close();
    }
}