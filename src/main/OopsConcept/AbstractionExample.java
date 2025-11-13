package main.OopsConcept;
abstract class Animal{
    Animal(){
        System.out.println("Animal class load");
    }
    abstract void walk();
    void eat(){
        System.out.println("Animal Eats");
    }
}

class Horse extends Animal{

    @Override
    void walk() {
        System.out.println("Horse walks on 4 legs.");
    }

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Animal animal = new Horse(); // This is known as runTime Polymorphism
        animal.eat();
        animal.walk();
    }
}

interface Vehicle{
    void petrolVehicle();
}

interface Car{
    int noOfWheels = 4;
    void startCar();
    void stopCar();
}

class Maruti implements Car,Vehicle{

    @Override
    public void startCar() {
        System.out.println("Maruti Car Start");
    }

    @Override
    public void stopCar() {
        System.out.println("Maruti Car Stop Engine");
    }

    public static void main(String[] args) {
        Maruti maruti = new Maruti();
        maruti.startCar();
        maruti.stopCar();
        maruti.petrolVehicle();
    }

    @Override
    public void petrolVehicle() {
        System.out.println("Maruti is petrol Vehicle");
    }
}

public class AbstractionExample {
}
