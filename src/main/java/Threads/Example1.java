package Threads;

class A extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("A > show");
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("B > show");
        }
    }
}


public class Example1 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
