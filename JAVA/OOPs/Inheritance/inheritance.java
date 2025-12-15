    package OOPs.Inheritance;


    /*
    * ===============================================
    *                Inheritance in Java
    * ===============================================
    *
    * ✅ Definition:
    * Inheritance is an OOP concept where one class (child/subclass) inherits
    * the fields and methods of another class (parent/superclass).
    *
    * ✅ Benefits of Inheritance:
    * - Code reusability
    * - Logical class hierarchy
    * - Reduces code duplication
    * - Supports polymorphism
    *
    * ✅ Syntax:
    * class Subclass extends Superclass {
    *     // additional fields/methods
    * }
    *
    * ✅ Types of Inheritance in Java:
    * 1. Single Inheritance         ✅
    * 2. Multilevel Inheritance     ✅
    * 3. Hierarchical Inheritance   ✅
    * 
    * ❌ Java does NOT support multiple inheritance using classes (only via interfaces)
    */

    // ------------ SINGLE INHERITANCE EXAMPLE ------------
    class Animal {
        void eat() {
            System.out.println("Animal eats food.");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks.");
        }
    }

    // ------------ MULTILEVEL INHERITANCE EXAMPLE ------------
    class BabyDog extends Dog {
        void weep() {
            System.out.println("Baby dog weeps.");
        }
    }

    // ------------ HIERARCHICAL INHERITANCE EXAMPLE ------------
    class Cat extends Animal {
        void meow() {
            System.out.println("Cat meows.");
        }
    }
    //----------------HYBRID INHERITANCE ---------------------------


    // MULTIPILE INHERITANCE is not supported in java through class 
    // but achevied through interfaces 

    
    public class inheritance {
        public static void main(String[] args) {

            System.out.println("=== Single Inheritance ===");
            Dog dog = new Dog();
            dog.eat();  // Inherited from Animal
            dog.bark();

            System.out.println("\n=== Multilevel Inheritance ===");
            BabyDog babyDog = new BabyDog();
            babyDog.eat();   // From Animal
            babyDog.bark();  // From Dog
            babyDog.weep();  // From BabyDog

            System.out.println("\n=== Hierarchical Inheritance ===");
            Cat cat = new Cat();
            cat.eat();   // From Animal
            cat.meow();  // Own method
        }
    }
