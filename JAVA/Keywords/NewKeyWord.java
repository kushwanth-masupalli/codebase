package Keywords;

/**
 * This class provides an overview of the 'new' keyword in Java, 
 * particularly its use in creating instances of non-primitive data types.
 */
public class NewKeyWord {
    /**
     * The main method demonstrates how to use the 'new' keyword 
     * to create objects for various non-primitive data types.
     */
    public static void main(String[] args) {
        // Creating an instance of a custom class using the new keyword
        MyClass myObject = new MyClass();
        
        // Creating an array of integers using the new keyword
        int[] numbersArray = new int[5];
        
        // Outputting some information to demonstrate usage
        System.out.println("Instance of MyClass: " + myObject);
        for (int i : numbersArray) {
            System.out.print(i + " ");
        }
    }
}

/**
 * A simple custom class to demonstrate the use of the 'new' keyword.
 */
class MyClass {
    // Properties and methods can be defined here
    
    public MyClass() {
        // Constructor implementation (if needed)
    }
}