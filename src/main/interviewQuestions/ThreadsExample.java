package main.interviewQuestions;

class A5 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi !");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class A6 extends Thread {
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println(" Hello !");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsExample {
    public static void main(String[] args) {
        A5 obj1 = new A5();
        A6 obj2 = new A6();

        System.out.println(obj1.getPriority());
        System.out.println(obj1.getState());
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();

    }
}
