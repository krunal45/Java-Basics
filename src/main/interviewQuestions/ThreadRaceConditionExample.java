package main.interviewQuestions;

class A7 {
    int count = 0;

    synchronized void count() {
        for (int i = 0; i < 10000; i++)
            count++;
    }
}

public class ThreadRaceConditionExample {
    public static void main(String[] args) throws InterruptedException {
        A7 obj0 = new A7();
        Runnable obj1 = obj0::count;
        Runnable obj2 = obj0::count;

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count : " + obj0.count);
    }
}