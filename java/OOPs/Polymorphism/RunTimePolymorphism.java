package OOPs.Polymorphism;

/*
 * ==================================================
 *         Runtime Polymorphism (Method Overriding)
 * ==================================================
 *
 * ✅ Definition:
 * Runtime polymorphism occurs when a subclass provides a specific
 * implementation of a method already defined in its superclass.
 *
 * ✅ Achieved By:
 * - Method Overriding
 *
 * ✅ Key Concept:
 * - Method to be called is determined at runtime based on the object type.
 * - This is also called "Dynamic Method Dispatch".
 */

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal a; // reference of superclass

        a = new Dog(); // object of subclass Dog
        a.sound();     // Output: Dog barks

        a = new Cat(); // object of subclass Cat
        a.sound();     // Output: Cat meows
    }
}
