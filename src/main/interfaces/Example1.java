package main.interfaces;

interface Car {
    String model = "Maruti";

    void drive();
}

class Baleno implements Car{

    @Override
    public void drive() {
        System.out.println("Driving "+model+" Baleno");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Car obj1 = new Baleno();
        obj1.drive();
    }
}