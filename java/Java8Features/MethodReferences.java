package Java8Features;

import java.util.*;
import java.util.function.*;

// A utility class for method reference examples
class Utility {
    // Static method
    public static void printStatic(String message) {
        System.out.println("Static: " + message);
    }

    // Instance method
    public void printInstance(String message) {
        System.out.println("Instance: " + message);
    }
}

// A simple class for constructor reference
class Person {
    String name;

    Person() {
        this.name = "Default Name";
        System.out.println("Constructor called: " + name);
    }

    Person(String name) {
        this.name = name;
        System.out.println("Constructor called: " + name);
    }
}

public class MethodReferences {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 1. Reference to a static method
        System.out.println("=== Static Method Reference ===");
        names.forEach(Utility::printStatic);

        // 2. Reference to an instance method of a particular object
        System.out.println("\n=== Instance Method of a Specific Object ===");
        Utility util = new Utility();
        names.forEach(util::printInstance);

        // 3. Reference to an instance method of an arbitrary object of a particular type
        System.out.println("\n=== Instance Method of Arbitrary Object ===");
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);  // Also a method reference!

        // 4. Reference to a constructor
        System.out.println("\n=== Constructor Reference ===");
        Supplier<Person> personSupplier = Person::new; // no-arg constructor
        Person p1 = personSupplier.get();

        Function<String, Person> personWithName = Person::new; // constructor with argument
        Person p2 = personWithName.apply("John Doe");
    }
}
