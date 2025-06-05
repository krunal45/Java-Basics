package Threads;

public class Example2 {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i <5 ; i++) {
                System.out.println("Hi!");
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i <5 ; i++) {
                System.out.println("Hello!");
            }
        };

        obj1.run();
        obj2.run();
    }
}
