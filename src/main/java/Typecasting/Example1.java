package Typecasting;

class A{
    int anInt = 2;

    void printValue(){
        System.out.println(anInt);
    }
}

class B extends A{
    int b = 3;

    @Override
    void printValue(){
        System.out.println(b);
    }
}

public class Example1 {
    public static void main(String[] args) {
        double num1 = 2.3;
        int num2 = (int) num1;
        System.out.println(num2);

//        class type casting
        A obj1 = new A();
        obj1.printValue();

        obj1 = new B();
        obj1.printValue();
    }
}
