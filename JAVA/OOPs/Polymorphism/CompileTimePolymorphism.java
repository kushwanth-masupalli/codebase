package OOPs.Polymorphism;

/*
 * ================================================
 *         Compile-Time Polymorphism (Overloading)
 * ================================================
 *
 * ✅ Definition:
 * Compile-time polymorphism occurs when multiple methods in the same class
 * have the same name but different parameters (type, number, or order).
 *
 * ✅ Achieved By:
 * - Method Overloading
 *
 * ✅ Benefits:
 * - Improves code readability
 * - Easy to maintain and flexible
 */

public class CompileTimePolymorphism {

    // Method with one int parameter
    void add(int a) {
        System.out.println("Sum = " + (a + 10));
    }

    

    // Overloaded method with two int parameters
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // Overloaded method with double parameters
    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }

    // Overloaded method with different parameter order
    void add(String message, int value) {
        System.out.println(message + ": " + value);
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();

        obj.add(5);                   // Calls method with one int
        obj.add(3, 7);                // Calls method with two ints
        obj.add(2.5, 3.7);            // Calls method with two doubles
        obj.add("Result", 100);       // Calls method with String and int
    }
}
