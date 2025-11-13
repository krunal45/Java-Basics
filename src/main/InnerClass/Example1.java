package main.InnerClass;

class A{
    int num = 5;

    void show(){
        System.out.println("--Num--"+num);
    }

    class B{
        void showB(){
            System.out.println("--In B--");
        }
    }
}

public class Example1 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.showB();
    }
}