
//**Question:**
//
//Write a Java program that creates **two threads**.
//- The **first thread** should print numbers from **1 to 5**, pausing for **1 second** between each number.
//- The **second thread** should print the **squares** of numbers from **1 to 5**, also pausing for **1 second** between each number.
//
//Both threads should run **concurrently**, and the output should interleave depending on the thread scheduler.

package main.Threads.Questions;

public class Question1 {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 1; i < 6; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i < 6; i++) {
                System.out.println(Math.pow(i, 2));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
        thread1.start();
        thread2.start();
    }
}