//Here’s a good **coding interview question** focused specifically on **`static` methods** in Java:
//
//---
//
//**Question:**
//You are asked to design a simple `MathUtil` class that provides utility methods for basic calculations.
//
//Implement the following **static methods** inside the `MathUtil` class:
//
//1. `add(int a, int b)` – returns the sum of two integers.
//2. `multiply(int a, int b)` – returns the product of two integers.
//
//**Requirements:**
//- Both methods should be `static` so they can be called without creating an object of `MathUtil`.
//- Write a `main` method that demonstrates calling both methods and prints the results.
//
//**Follow-up:**
//- Why do we declare these methods as `static`?
//- What would happen if they were **not** `static**?**
//
//---

package main.staticKeyword;

public class MathUtil {
    String name;

    static int add(int num1, int num2) {
        return (num1 + num2);
    }

    static int multiply(int num1, int num2) {
        return (num1 * num2);
    }

    public static void main(String[] args) {
        int[][] numbers = {{1, 2}, {3, 4}, {5, 6}};
        for (int[] nums : numbers) {
            System.out.println("Addition: " + add(nums[0], nums[1]));
            System.out.println("Multiplication: " + multiply(nums[0], nums[1]));
        }
    }
}