/**
 * Abstraction using Abstract Class
 */

// Abstract class (cannot be instantiated)
abstract class Vehicle { // Corrected class name (capitalized to match Java conventions)
    // Abstract method (does not have a body)
    abstract void start();

    // Concrete method (has a body)
    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

// Concrete class extending the abstract class
class Car extends Vehicle { // Corrected class name (capitalized to match Java conventions)
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Creating an object of the concrete subclass, not the abstract class
        Vehicle myCar = new Car(); 
        myCar.start(); // Calls overridden method
        myCar.stop();  // Calls inherited concrete method
    }
}
