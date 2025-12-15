package LiteralsAndVariables;

public class Literals {
    public static void main(String[] args) {

        //A literal is a fixed value assigned to a variable. It is the actual data written in the code.

        // 1. Integer literals
        int decimal = 100;              // decimal
        int octal = 0144;               // octal (starts with 0)
        int hex = 0x64;                 // hexadecimal (starts with 0x)
        int binary = 0b1100100;         // binary (starts with 0b)

        System.out.println("Integer Literals:");
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal (0144): " + octal);
        System.out.println("Hex (0x64): " + hex);
        System.out.println("Binary (0b1100100): " + binary);
        System.out.println();

        // 2. Floating-point literals
        float floatVal = 10.5f;         // must have 'f' or 'F'
        double doubleVal = 20.99;       // default is double

        System.out.println("Floating-point Literals:");
        System.out.println("Float: " + floatVal);
        System.out.println("Double: " + doubleVal);
        System.out.println();

        // 3. Character literals
        char ch1 = 'A';
        char ch2 = 65;                  // Unicode value
        char ch3 = '\u0041';            // Unicode escape

        System.out.println("Character Literals:");
        System.out.println("Char: " + ch1);
        System.out.println("Char from int: " + ch2);
        System.out.println("Unicode char: " + ch3);
        System.out.println();

        // 4. String literal
        String str = "Hello, Java!";

        System.out.println("String Literal:");
        System.out.println("String: " + str);
        System.out.println();

        // 5. Boolean literals
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("Boolean Literals:");
        System.out.println("True: " + isTrue);
        System.out.println("False: " + isFalse);
        System.out.println();

        // 6. Null literal (used with object references)
        String nullStr = null;

        System.out.println("Null Literal:");
        System.out.println("nullStr: " + nullStr);
    }
}
