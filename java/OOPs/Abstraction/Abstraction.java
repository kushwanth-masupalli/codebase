package OOPs.Abstraction;

import OOPs.Abstraction.Animal;
import OOPs.Abstraction.Dog;

/*
 * ===============================================
 *               Abstraction in Java
 * ===============================================
 *
 * ✅ Definition:
 * Abstraction is an OOP concept that hides complex implementation details
 * and shows only the essential features of an object.
 *
 * ✅ Achieved Using:
 * - Abstract classes
 * - Interfaces
 *
 * ✅ Key Benefits:
 * - Reduces complexity by hiding internal logic
 * - Increases security by exposing only required parts
 * - Improves maintainability and flexibility
 *
 * =================================================
 *                 Abstract Class
 * =================================================
 * - Can contain both abstract and concrete methods
 * - Can have instance variables and constructors
 * - Cannot be instantiated directly
 * - Suitable for sharing common code among related classes
 */

// Abstract class representing a Vehicle
abstract class Vehicle {
    String brand = "Generic Vehicle"; // instance variable

    // Abstract method (no body)
    public abstract void start();

    // Concrete method (with body)
    public void stop() {
        System.out.println(brand + " stopped.");
    }

    // Constructor
    public Vehicle() {
        System.out.println("Vehicle constructor called.");
    }
}

// Concrete class that extends abstract class
class Car extends Vehicle {
    public Car() {
        brand = "Car";
    }

    @Override
    public void start() {
        System.out.println(brand + " starts with a key.");
    }
}

/*
 * =================================================
 *                     Interface
 * =================================================
 * - All methods are abstract by default (until Java 8)
 * - From Java 8+: can have default and static methods
 * - Cannot have instance variables (only constants)
 * - Supports multiple inheritance
 */

// Interface representing an Animal
interface Animal {
    // Abstract method
    void makeSound();

    // Default method (Java 8+)
    default void sleep() {
        System.out.println("Animal is sleeping.");
    }

    // Static method (Java 8+)
    static void info() {
        System.out.println("Animals have different sounds.");
    }

    // public static final variable (constant)
    int NUMBER_OF_LEGS = 4;
}

// Class implementing interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        System.out.println("=== Abstraction using Abstract Class ===");
        Vehicle myCar = new Car(); // Polymorphism
        myCar.start();             // Abstract method implementation
        myCar.stop();              // Concrete method in abstract class

        System.out.println("\n=== Abstraction using Interface ===");
        Animal myDog = new Dog();
        myDog.makeSound();         // Abstract method
        myDog.sleep();             // Default method from interface
        Animal.info();             // Static method from interface

        System.out.println("Number of legs: " + Animal.NUMBER_OF_LEGS); // Constant from interface
    }
}
