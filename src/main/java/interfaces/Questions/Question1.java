//### 🧠 **Java Interface Coding Question**
//
//**Question:**
//Create a Java program that defines an interface called `Vehicle` with the following methods:
//
//- `void start();`
//- `void stop();`
//
//Then, implement this interface in two classes: `Car` and `Bike`. Each class should provide its own implementation of the `start()` and `stop()`
// methods. Finally, write a `main` method to demonstrate polymorphism by calling the methods using a `Vehicle` reference.
//
//---
//
//Would you like a hint or the solution after you try it? 😊
package interfaces.Questions;

interface Vehicle{
    void start();
    void stop();
}

class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Start Car");
    }

    @Override
    public void stop() {
        System.out.println("Stop Car");
    }
}

class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Start Bike");
    }

    @Override
    public void stop() {
        System.out.println("Stop Bike");
    }
}

public class Question1 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}