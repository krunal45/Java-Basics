/*
Take an array of names as input from the user and print them on the screen
 */
package main.arrayBasics;

import java.util.Scanner;

public class OneDimensionArrayExample {
    public static void main(String[] args) {
        //variable declaration
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        int size = 0;

        //Taking input from user.
        while (!flag) {
            System.out.println("Please enter number of names you want to store: ");
            size = input.nextInt();
            System.out.println("Thanks for your input. You said you want to enter " + size + " names ? Correct ?");
            System.out.println("Please Enter 1. Yes 2. No");
            String value = input.next();
            if (value.equalsIgnoreCase("Yes"))
                flag = true;
            else if (value.equalsIgnoreCase("No")) {
            }
            else
                System.out.println("Invalid Input. Please Enter 1. Yes 2. No");
        }
        String names[] = new String[size];

        //Taking names input from user
        for (int index = 0; index < size; index++) {
            System.out.println("Please Enter name"+(index + 1));
            names[index] = input.next();
        }

        //printing output
        for (int index = 0; index < size; index++) {
            System.out.println("Name "+(index + 1)+" : "+names[index]);
        }
    }
}

//Code inputs from Chat - GPT:
//Here are some suggestions to improve the code for better user experience and overall readability:
//
//        1. **Prompt Clarity**: Use clear and user-friendly prompts to make the input process smoother.
//        2. **Error Handling**: Add checks for invalid input (non-integer or negative values) when entering the size.
//        3. **Consistent Input Options**: Use numbers consistently for options (1 for Yes, 2 for No) to avoid confusion.
//        4. **Closing Resources**: Always close the `Scanner` resource to avoid potential resource leaks.
//        5. **Improved Loop for Yes/No Confirmation**: Simplify the confirmation loop to handle invalid input more efficiently.
//        6. **Use of Methods**: Encapsulate different tasks into methods to improve readability and maintainability.
//        7. **Enhanced Output**: Provide clearer feedback when the program is waiting for user input.
//
//Here’s the refactored code with these improvements:
//
//        ```java
//package arrayBasics;
//
//import java.util.Scanner;
//
//public class OneDimensionArrayExample {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int size = getArraySize(input);
//        String[] names = getNames(input, size);
//
//        displayNames(names);
//
//        input.close();
//    }
//
//    private static int getArraySize(Scanner input) {
//        int size = 0;
//        boolean validInput = false;
//
//        while (!validInput) {
//            System.out.println("Please enter the number of names you want to store: ");
//            if (input.hasNextInt()) {
//                size = input.nextInt();
//                if (size > 0) {
//                    validInput = confirmInput(input, "You want to enter " + size + " names. Correct?");
//                } else {
//                    System.out.println("The number must be positive. Please try again.");
//                }
//            } else {
//                System.out.println("Invalid input. Please enter a valid number.");
//                input.next(); // Clear invalid input
//            }
//        }
//        return size;
//    }
//
//    private static boolean confirmInput(Scanner input, String message) {
//        while (true) {
//            System.out.println(message);
//            System.out.println("Please Enter 1. Yes 2. No");
//            String value = input.next();
//            if (value.equals("1")) {
//                return true;
//            } else if (value.equals("2")) {
//                return false;
//            } else {
//                System.out.println("Invalid input. Please enter 1 for Yes or 2 for No.");
//            }
//        }
//    }
//
//    private static String[] getNames(Scanner input, int size) {
//        String[] names = new String[size];
//        input.nextLine(); // Consume the newline left-over
//        for (int i = 0; i < size; i++) {
//            System.out.println("Please enter name " + (i + 1) + ":");
//            names[i] = input.nextLine();
//        }
//        return names;
//    }
//
//    private static void displayNames(String[] names) {
//        System.out.println("You have entered the following names:");
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Name " + (i + 1) + ": " + names[i]);
//        }
//    }
//}
//```
//
//        ### Changes Made:
//        1. **Input Validation for Size**: Ensures only positive integers are accepted.
//        2. **Consistent Confirmation Input**: Used numeric options consistently for Yes/No.
//3. **Encapsulation in Methods**: The tasks are divided into `getArraySize`, `confirmInput`, `getNames`, and `displayNames` for clarity and separation of concerns.
//4. **Resource Management**: Closed the `Scanner` object properly.