package main.FinalKeyWord;

class A {
    final String NAME = "ABC";//variables declared with final keyword cannot be altered.
    String developerName = "Ajay";

    void printName() {
        System.out.println("Name: "+NAME);
    }

//    Methods with final keyword cannot be over-ridden
    final void printDevName(){
        System.out.println("Developer: "+developerName);
    }
}

//class with final keyword cannot be extended
final class B extends A{
     void show(){
         System.out.println("In B");
     }
}

public class Example1 {
    public static void main(String[] args) {
      B obj = new B();
      obj.printName();
      obj.printDevName();
      obj.show();
    }
}