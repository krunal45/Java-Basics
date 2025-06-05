
//**Question:**
//

//Implement a class `SafeCounter` with the following requirements:
//
//- It has a private integer variable `count`.
//- It provides a method `increment()` that increases the count by 1.
//- It provides a method `getCount()` that returns the current value of `count`.
//- Ensure that the `increment()` method is thread-safe using the `synchronized` keyword.
//
//Then, write a small program that:
//- Creates multiple threads (e.g., 5 threads).
//- Each thread calls `increment()` 1000 times.
//- After all threads finish, print the final value of `count`.

package Threads.Questions;

class SafeCounter{
    private int count = 0;

    synchronized void increment(){
        count++;
    }

    int getCount(){
        return count;
    }
}

public class Question2 {
    public static void main(String[] args) throws InterruptedException {
        SafeCounter safeCounter = new SafeCounter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                safeCounter.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                safeCounter.increment();
            }
        };

        Runnable obj3 = () -> {
            for (int i = 0; i < 1000; i++) {
                safeCounter.increment();
            }
        };

        Runnable obj4 = () -> {
            for (int i = 0; i < 1000; i++) {
                safeCounter.increment();
            }
        };

        Runnable obj5 = () -> {
            for (int i = 0; i < 1000; i++) {
                safeCounter.increment();
            }
        };

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
        Thread thread3 = new Thread(obj3);
        Thread thread4 = new Thread(obj4);
        Thread thread5 = new Thread(obj5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

        System.out.println("Count > "+safeCounter.getCount());
    }
}