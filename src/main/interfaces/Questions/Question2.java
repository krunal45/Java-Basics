//        **Question:**
//Create two interfaces:
//
//        1. `Engine` with:
//        - `void start();`
//        - `default void fuelType()` that prints `"Petrol"`.
//
//        2. `Electric` with:
//        - `void charge();`
//        - `default void fuelType()` that prints `"Electric"`.
//
//Now, create a class `HybridCar` that implements both `Engine` and `Electric`. Since both interfaces have a default method
// with the same name (`fuelType()`), you must resolve the conflict in `HybridCar`.
//
//In the `main` method, demonstrate:
//
//        - Starting the engine
//- Charging the car
//- Calling the resolved `fuelType()` method
//
//---
package main.interfaces.Questions;

interface Engine {
    void start();

    default void fuelType() {
        System.out.println("--Petrol--");
    }
}

interface Electric {
    void charge();

    default void fuelType() {
        System.out.println("--Electric--");
    }
}

class HybridCar implements Engine, Electric {

    @Override
    public void charge() {
        System.out.println("Charging Electric Car");
    }

    @Override
    public void start() {
        System.out.println("Starting Car");
    }

    @Override
    public void fuelType() {
        Engine.super.fuelType();
    }
}

public class Question2 {
    public static void main(String[] args) {
        Engine engine = new HybridCar();
        engine.fuelType();
        engine.start();
    }
}