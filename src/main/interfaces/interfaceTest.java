package main.interfaces;

public class interfaceTest extends A implements B {
    public static void main(String[] args) {
        new interfaceTest().m1();
        new interfaceTest().m2();
        B b = new interfaceTest();
        b.m2();
    }

    @Override
    public void m1() {
        System.out.println("Inside Method m1 of abstract class A");
    }

    @Override
    public void m2() {
        B.super.m2();
    }
}

abstract class A {
    abstract void m1();

    void m2() {
        System.out.println("Inside non-abstract Method m2 of abstract class A");
    }
}

interface B {
    abstract void m1();

    default void m2() {
        System.out.println("Inside default method of interface B");
    }
}