package OOPs.Inheritance;

class Parent {
    int num = 100;

    Parent() {
        System.out.println("Parent class constructor");
    }

    void display() {
        System.out.println("Parent class method");
    }
}

public class Super extends Parent {
    int num = 200;

    Super() {
        // Call parent class constructor
        super();
        System.out.println("Child class constructor");
    }

    void display() {
        // Call parent class method
        super.display();

        System.out.println("Child class method");
    }

    void show() {
        // Access parent class variable
        System.out.println("Parent num: " + super.num);
        System.out.println("Child num: " + this.num);
    }

    public static void main(String[] args) {
        Super obj = new Super();

        obj.display();  // Calls overridden method with super
        obj.show();     // Accesses parent and child variables
    }
}
