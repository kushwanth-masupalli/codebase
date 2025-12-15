package LiteralsAndVariables;

public class VariablesDemo {
    

    //A variable is a named memory location used to store data that can change during the execution of a program.
    // 1. Static variable (Class-level, shared across all objects)
    static int staticVar = 100;

    // 2. Instance variable (Non-static, belongs to object)
    int instanceVar = 200;

    public void demonstrateVariables() {
        // 3. Local variable (Declared inside method)
        int localVar = 300;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {

        // 4. Declare and initialize primitive variables
        byte byteVar = 10;
        short shortVar = 1000;
        int intVar = 100000;
        long longVar = 10000000000L;
        float floatVar = 12.34f;
        double doubleVar = 12345.6789;
        char charVar = 'A';
        boolean boolVar = true;

        System.out.println("Primitive Variables:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        System.out.println();

        // 5. Reference variable (points to object)
        String name = "Java";
        VariablesDemo obj = new VariablesDemo(); // reference variable to object

        System.out.println("Reference Variable:");
        System.out.println("String name: " + name);
        System.out.println();

        // 6. Access instance and static variables
        obj.demonstrateVariables();

        // 7. Access static variable directly from static context
        System.out.println("Access static variable in main: " + staticVar);
    }
}
