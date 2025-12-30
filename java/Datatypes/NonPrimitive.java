package Datatypes;

/**
 * This class provides an overview of non-primitive data types in Java. Non-primitive data types 
 * are a category of data types that are not considered as basic or elementary. They are derived from 
 * fundamental data types and include classes, arrays, interfaces, and the special case of String.
 */
public class NonPrimitive {
    /**
     * The main method demonstrates how to create instances of non-primitive data types using the `new` keyword.
     * It also provides examples of each type: classes, arrays, interfaces, and the immutable String class.
     */
    public static void main(String[] args) {
        // Example of a custom class instance
        MyClass myObject = new MyClass("example");
        
        // Example of an array (int array in this case)
        int[] numbers = new int[5];
        
        // Example of implementing an interface
        Runnable runnable = () -> System.out.println("Running...");
        
        // Example of the immutable String class
        String str = "Hello, World!";
        
        // Outputting some information to demonstrate usage
        System.out.println("MyClass instance: " + myObject);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        runnable.run();
        System.out.println("String example: " + str);
    }
}

/**
 * A simple custom class to demonstrate non-primitive data types.
 */
class MyClass {
    private String value;
    
    public MyClass(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "MyClass{" + "value='" + value + '\'' + '}';
    }
}