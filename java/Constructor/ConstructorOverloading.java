package Constructor;

public class ConstructorOverloading {
    String name;
    int age;

    // Default constructor
    ConstructorOverloading() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default Constructor Called");
    }

    // Constructor with one parameter
    ConstructorOverloading(String name) {
        this.name = name;
        this.age = 0;
        System.out.println("Constructor with String Called");
    }

    // Constructor with two parameters
    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with String and int Called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to test
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();           // Calls default
        obj1.display();

        ConstructorOverloading obj2 = new ConstructorOverloading("Alice");    // Calls 1-param
        obj2.display();

        ConstructorOverloading obj3 = new ConstructorOverloading("Bob", 25);  // Calls 2-param
        obj3.display();
    }
}
