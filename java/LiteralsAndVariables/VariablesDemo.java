package LiteralsAndVariables;

public class VariablesDemo {
    

    //A variable is a named memory location used to store data that can change during
    // the execution of a program.
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

    void add(int a, int b){        // 4 . parameters
         System.out.println(a+b);
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

/*   there are four types of variable

   1) Local variable

      * declared inside methods , constructors or blocks
      * created when the block starts
      * destroyed when the block ends
      * no default value

   2) Instance variable
      * declared inside class but outside methods
      * belong to object
      * have default values
      * Each object gets its own copy
      * Have default values

    3) Static variables
      * declared using static
      * belong to the class
      * one copy shared by all objects
      * stored in method area
      * have default values

    4) Parameters
       * variables passed to methods or constructors
       * act like local variables
       * scope limited to the method




* */