package main.interviewQuestions;

interface Computer {
//    1. Variables inside 'interface' are always by default static | final.
//    2. Methods inside 'interface' are always by default public and abstract
//    3. We can define non-abstract methods in interface by specifying default keyword.
//    4. We can't create constructor inside an interface.
    int age = 25;
    String name = "Krunal";

    void code();

}

interface B {
//    This is non-abstract method.
    default void methodB1() {
        System.out.println("--Inside methodB1--");
    }

    void methodB2();
}

interface C extends B {

}

class desktop implements Computer, B {

    @Override
    public void code() {
        System.out.println("--Coding on desktop--");
    }

    @Override
    public void methodB2() {
        System.out.println("--Inside methodB2--");
    }
}

class laptop implements Computer {

    @Override
    public void code() {
        System.out.println("--Coding on laptop--");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Computer obj1 = new desktop();
        Computer obj2 = new laptop();
        B obj3 = new desktop();
        System.out.println(obj1.age + "  " + obj1.name);
        System.out.println(Computer.age + "  " + Computer.name);
        obj1.code();
        obj3.methodB1();
        obj3.methodB2();
        obj2.code();

    }
}
