//        **Question:**
//Write a Java program that takes two integers as input from the user and performs division.
// Use a `try-catch` block to handle the following exceptions:
//
//        1. **`ArithmeticException`** – when the user tries to divide by zero.
//        2. **`InputMismatchException`** – when the user enters a non-integer value.
//
//Print appropriate error messages for each exception and ensure the program does not crash.

package main.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, j = 0, result = 0;

        while (true) {
            try {
                System.out.println("Please Enter 2 numbers");
                i = input.nextInt();
                j = input.nextInt();
                result = i / j;
                System.out.println(result);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input! Please Enter Again!");
                input.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide a number by 0!");
            }
        }
        input.close();
    }
}