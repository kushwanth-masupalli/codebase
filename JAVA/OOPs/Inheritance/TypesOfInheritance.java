package OOPs.Inheritance;
// Inheritance in Java:
// Inheritance is a mechanism in Java where one class (child or subclass) can acquire the properties and behaviors of another class (parent or superclass).
// It promotes code reuse and supports method overriding for achieving runtime polymorphism.

// Types of Inheritance in Java:
// 1. Single Inheritance: A child class inherits from one parent class.
// 2. Multilevel Inheritance: A class inherits from a class that itself inherits from another class.
// 3. Hierarchical Inheritance: Multiple classes inherit from the same parent class.
// 4. Multiple Inheritance (with Interfaces): A class implements multiple interfaces. Java avoids multiple inheritance with classes due to ambiguity issues.

public class TypesOfInheritance {
    // 1. Single Inheritance Example
    static class Parent {
        void display() {
            System.out.println("This is the Parent class.");
        }
    }

    static class Child extends Parent {
        void show() {
            System.out.println("This is the Child class.");
        }
    }

    // 2. Multilevel Inheritance Example
    static class Grandparent {
        void greet() {
            System.out.println("Hello from the Grandparent class.");
        }
    }

    static class MiddleParent extends Grandparent {
        void say() {
            System.out.println("Hello from the MiddleParent class.");
        }
    }

    static class FinalChild extends MiddleParent {
        void introduce() {
            System.out.println("Hello from the FinalChild class.");
        }
    }

    // 3. Hierarchical Inheritance Example
    static class BaseParent {
        void commonMethod() {
            System.out.println("Method from BaseParent class.");
        }
    }

    static class ChildA extends BaseParent {
        void featureA() {
            System.out.println("Feature of ChildA class.");
        }
    }

    static class ChildB extends BaseParent {
        void featureB() {
            System.out.println("Feature of ChildB class.");
        }
    }

    // 4. Multiple Inheritance with Interfaces Example
    // ambiguty 
    
    interface InterfaceA {
        void methodA();
    }

    interface InterfaceB {
        void methodB();
    }

    static class CombinedClass implements InterfaceA, InterfaceB {
        public void methodA() {
            System.out.println("MethodA from InterfaceA.");
        }

        public void methodB() {
            System.out.println("MethodB from InterfaceB.");
        }
    }

    public static void main(String[] args) {
        // Demonstration of Single Inheritance
        System.out.println("1. Single Inheritance:");
        Child singleInheritance = new Child();
        singleInheritance.display(); // Parent method
        singleInheritance.show();    // Child method

        // Demonstration of Multilevel Inheritance
        System.out.println("\n2. Multilevel Inheritance:");
        FinalChild multilevelInheritance = new FinalChild();
        multilevelInheritance.greet();      // Grandparent method
        multilevelInheritance.say();        // MiddleParent method
        multilevelInheritance.introduce();  // FinalChild method

        // Demonstration of Hierarchical Inheritance
        System.out.println("\n3. Hierarchical Inheritance:");
        ChildA hierarchicalChildA = new ChildA();
        hierarchicalChildA.commonMethod();  // BaseParent method
        hierarchicalChildA.featureA();      // ChildA method

        ChildB hierarchicalChildB = new ChildB();
        hierarchicalChildB.commonMethod();  // BaseParent method
        hierarchicalChildB.featureB();      // ChildB method

        // Demonstration of Multiple Inheritance with Interfaces
        System.out.println("\n4. Multiple Inheritance with Interfaces:");
        CombinedClass multipleInheritance = new CombinedClass();
        multipleInheritance.methodA(); // InterfaceA method
        multipleInheritance.methodB(); // InterfaceB method
    }
}
