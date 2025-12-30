package Datatypes;

public class Primitive {
    // Primitive data types are also called built-in data types.
    // These are the most basic data types available in Java.
    // They are stored in stack memory and not objects (except when boxed).
    
    // 1. byte: 8-bit signed integer
    byte byteValue = 100; // Size: 1 byte (8 bits), Range: -128 to 127, Default: 0

    // 2. short: 16-bit signed integer
    short shortValue = 10000; // Size: 2 bytes (16 bits), Range: -32,768 to 32,767, Default: 0

    // 3. int: 32-bit signed integer
    int intValue = 100000; // Size: 4 bytes (32 bits), Range: -2^31 to 2^31-1, Default: 0

    // 4. long: 64-bit signed integer
    long longValue = 10000000000L; // Size: 8 bytes (64 bits), Range: -2^63 to 2^63-1, Default: 0L

    // 5. float: 32-bit floating point number
    float floatValue = 3.14f; // Size: 4 bytes (32 bits), Default: 0.0f
    
    //After Normalization
    // sign 1 bit
    // 8 bit for exponent
    // remaining for the mantissa

    // 6. double: 64-bit floating point number
    double doubleValue = 3.141592653589793; // Size: 8 bytes (64 bits), Default: 0.0d

    //After Normalization
    // sign 1 bit
    // 11 bit for exponent
    // remaining for the mantissa

    // 7. char: 16-bit Unicode character
    char charValue = 'A'; // Size: 2 bytes (16 bits), Range: 0 to 65,535, Default: '\u0000'

    // 8. boolean: true or false
    boolean booleanValue = true; // Size: JVM dependent (usually 1 bit internally), Default: false
}
