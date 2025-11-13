//Here's a coding interview question suitable for an **SDET 1** role that tests understanding of the `static` keyword in Java:
//
//---
//
//**Question:**
//You are asked to create a utility class for logging messages in your automation framework. This class should ensure that:
//
//1. A counter keeps track of how many log messages have been printed in total.
//2. Each time a message is logged, it prints the message along with the current count.
//
//Implement the `LoggerUtil` class using the `static` keyword appropriately. Also, write a short `main` method to demonstrate its
// usage by logging three different messages.
//
//**Follow-up:**
//- Explain why you chose to use `static` in certain parts of your class.
//- What would change if the counter was not declared as `static`?
//
//---
//
package main.staticKeyword;

public class LoggerUtils {
    static int loginMessageCounter = 0;


    void printMessage(String message) {
        loginMessageCounter++;
        System.out.println(message + ": " + loginMessageCounter);
    }

    public static void main(String[] args) {
        LoggerUtils obj = new LoggerUtils();
        for (int i = 0; i < 3; i++)
            obj.printMessage("Message ");
    }
}