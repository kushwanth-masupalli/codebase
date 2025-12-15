package Constructor;

class Human {
    String name;

    // Default constructor
    Human() {
        name = "the_robust_18";
        System.out.println("I am from Human class");
    }

    // Copy constructor
    Human(Human other) {
        this.name = other.name;
        System.out.println("Copy constructor called for Human");
    }
}

class Alien {
    int id;

    // Parameterized constructor
    Alien(int a) {
        id = a;
        System.out.println("Alien ID: " + id);
    }

    // Copy constructor
    Alien(Alien other) {
        this.id = other.id;
        System.out.println("Copy constructor called for Alien");
    }
}

public class constructor {
    public static void main(String[] args) {

        // Using default constructor
        Human h1 = new Human();
        System.out.println("Original Human name: " + h1.name);

        // Using copy constructor
        Human h2 = new Human(h1);
        System.out.println("Copied Human name: " + h2.name);
        h2.name = "the_robust_18_copy"; // Modifying copied object
        System.out.println("Modified Human name: " + h2.name);
        

        // Using parameterized constructor
        Alien a1 = new Alien(434);
        System.out.println("Original Alien ID: " + a1.id);

        // Using copy constructor
        Alien a2 = new Alien(a1);
        System.out.println("Copied Alien ID: " + a2.id);
    }
}
