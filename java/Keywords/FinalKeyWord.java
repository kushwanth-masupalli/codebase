package Keywords;


/*
 * 
Context                  	Meaning
Final variable	            Value cannot be reassigned after it’s initialized.
Final method	            Cannot be overridden by subclasses.
Final class	                Cannot be extended (no subclassing).
Final parameter           	Cannot be modified within the method.

 */
// File: FinalKeywordDemo.java

// A final class cannot be extended
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

class FinalKeywordDemo {

    // Final instance variable must be initialized once
    final int instanceFinalVar;

    // Final static variable (constant for the class)
    public static final double PI = 3.14159;

    // Regular final variable (initialized directly)
    final int constant = 10;

    // Constructor to initialize final instance variable
    FinalKeywordDemo(int id) {
        this.instanceFinalVar = id;
    }

    // Final method cannot be overridden in subclasses
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    // Method with a final parameter
    public void printFinalParam(final int num) {
        // num = num + 1; // ❌ Not allowed: Cannot change a final parameter
        System.out.println("Final parameter: " + num);
    }

    // Using a final local variable
    public void showFinalLocalVar() {
        final String message = "This is a final local variable.";
        // message = "Try to change"; // ❌ Not allowed
        System.out.println(message);
    }

    public static void main(String[] args) {
        FinalKeywordDemo obj = new FinalKeywordDemo(101);

        // Accessing final variables
        System.out.println("Final constant: " + obj.constant);
        System.out.println("Final instance variable: " + obj.instanceFinalVar);
        System.out.println("Final static variable PI: " + FinalKeywordDemo.PI);

        // Using final method
        obj.finalMethod();

        // Final parameter
        obj.printFinalParam(50);

        // Final local variable
        obj.showFinalLocalVar();

        // Using a final class
        FinalClass finalClassObj = new FinalClass();
        finalClassObj.display();
    }
}
