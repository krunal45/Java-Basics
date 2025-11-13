package main.OopsConcept.Polymorphism;

class A {

    void show() {
        System.out.println("In A Show");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("In B Show");
    }
}

class C extends A {
    @Override
    void show() {
        System.out.println("In C Show");
    }
}

public class RunTimePolymorphismExample {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();

        obj1 = new B();
        obj1.show();

        obj1 = new C();
        obj1.show();
    }
}
