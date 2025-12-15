/*
 * Type Conversion

Type conversion is the process of converting a value from one
 data type to another compatible data type. The goal of type 
 conversion is to change the representation of the value without 
 changing its actual value. Type conversion can be explicit (e.g., 
 using a cast) or implicit (e.g., automatic promotion in arithmetic
  operations).

Examples of Type Conversion:

Converting an int to a double: int x = 5; double y = x;
Converting a string to an integer: "123".toInt()
Type Casting

Type casting, on the other hand, is the process of explicitly 
converting a value from one data type to another incompatible 
data type using a cast operator (e.g., int() in Java). Type casting
 can result in either narrowing or widening conversion.

Examples of Type Casting:

Widening conversion: Converting an int to a long: (long) x = 5;
Narrowing conversion: Converting a double to an int: (int) y = 3.14;
Key differences between type conversion and type casting:

Implicit vs. Explicit: Type conversion can be implicit, while type
 casting is always explicit.
Widening vs. Narrowing: Type conversion often involves widening 
conversion (e.g., from int to double), whereas type casting can 
result in either widening or narrowing conversion.
 */

package Datatypes;

public class TypeCastingDemo {
    public static void main(String[] args) {

        // =============================
        // 1. Primitive Typecasting
        // =============================

        // Implicit Casting (Widening) - safe
        byte b1 = 10;
        short s1 = b1;       // byte -> short
        int i1 = s1;         // short -> int
        long l1 = i1;        // int -> long
        float f1 = l1;       // long -> float
        double d1 = f1;      // float -> double

        System.out.println("Widening: byte to double = " + d1);

        // Explicit Casting (Narrowing) - may lose data
        double d2 = 123.456;
        float f2 = (float) d2;
        long l2 = (long) f2;
        int i2 = (int) l2;
        short s2 = (short) i2;
        byte b2 = (byte) s2;

        System.out.println("Narrowing: double to byte = " + b2);

        // Casting with possible data loss
        int bigInt = 130;
        byte smallByte = (byte) bigInt;
        System.out.println("int 130 cast to byte = " + smallByte); // -126 (overflow)

        // =============================
        // 2. Typecasting with char
        // =============================
        char ch = 'A';
        int chVal = ch; // char to int
        System.out.println("char to int: 'A' = " + chVal); // 65

        int num = 66;
        char ch2 = (char) num; // int to char
        System.out.println("int to char: 66 = " + ch2); // 'B'

        // =============================
        // 3. Boolean is NOT castable
        // =============================
        // boolean b = (boolean) 1; // ❌ Not allowed in Java

        // =============================
        // 4. Object Typecasting (Reference Types)
        // =============================

        // Upcasting (Child → Parent) – Implicit and safe
        Dog dog = new Dog();
        Animal animal = dog; // Upcasting
        animal.sound();

        // Downcasting (Parent → Child) – Explicit and risky
        Animal a = new Dog(); // Upcast
        if (a instanceof Dog) {
            Dog d = (Dog) a; // Downcast
            d.bark();
        }

        // ❌ Unsafe Downcasting
        Animal a2 = new Animal(); // Base object
        if (a2 instanceof Dog) {
            Dog d3 = (Dog) a2; // Will not execute
            d3.bark();
        } else {
            System.out.println("a2 is not a Dog instance");
        }

        // =============================
        // 5. String Conversion
        // =============================

        // a) Primitive → String
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 5.5f;
        double d = 6.6;
        char c = 'A';
        boolean bool = true;
         
        System.out.println("byte to String: " + String.valueOf(b));
        System.out.println("short to String: " + String.valueOf(s));
        System.out.println("int to String: " + String.valueOf(i));
        System.out.println("long to String: " + String.valueOf(l));
        System.out.println("float to String: " + String.valueOf(f));
        System.out.println("double to String: " + String.valueOf(d));
        System.out.println("char to String: " + String.valueOf(c));
        System.out.println("boolean to String: " + String.valueOf(bool));

        // b) String → Wrapper class values
        String numStr = "123";
        int parsedInt = Integer.parseInt(numStr);
        System.out.println("String to int: " + parsedInt);

        double parsedDouble = Double.parseDouble("12.34");
        System.out.println("String to double: " + parsedDouble);

        // ✅ Demonstrate all wrapper class conversions from String
        // here the input of these functions should be string not any
        // other data type
        byte parsedByte = Byte.parseByte("10");
        short parsedShort = Short.parseShort("32000");
        long parsedLong = Long.parseLong("123456789");
        float parsedFloat = Float.parseFloat("3.14");
        boolean parsedBoolean = Boolean.parseBoolean("true"); // case-insensitive
        char parsedChar = "X".charAt(0); // No parseChar, use charAt(0)

        System.out.println("String to byte: " + parsedByte);
        System.out.println("String to short: " + parsedShort);
        System.out.println("String to long: " + parsedLong);
        System.out.println("String to float: " + parsedFloat);
        System.out.println("String to boolean: " + parsedBoolean);
        System.out.println("String to char: " + parsedChar);
    }
}

// =====================
// Helper Classes
// =====================
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
