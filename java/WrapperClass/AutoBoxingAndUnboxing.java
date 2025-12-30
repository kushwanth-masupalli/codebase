package WrapperClass;

public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        
        // Autoboxing: primitive to object
        int primitiveInt = 100;
        Integer wrapperInt = primitiveInt;  // Autoboxing
        System.out.println("Autoboxed Integer: " + wrapperInt);

        double primitiveDouble = 25.5;
        Double wrapperDouble = primitiveDouble;  // Autoboxing
        System.out.println("Autoboxed Double: " + wrapperDouble);

        char primitiveChar = 'A';
        Character wrapperChar = primitiveChar;  // Autoboxing
        System.out.println("Autoboxed Character: " + wrapperChar);

        boolean primitiveBool = true;
        Boolean wrapperBool = primitiveBool;  // Autoboxing
        System.out.println("Autoboxed Boolean: " + wrapperBool);

        // Unboxing: object to primitive
        Integer boxedInt = new Integer(200);
        // the construttor Integer(int) is deprecated, use Integer.valueOf(int) instead
           // Integer boxedInt = Integer.valueOf(200);
        int unboxedInt = boxedInt;  // Unboxing
        System.out.println("Unboxed int: " + unboxedInt);

        Double boxedDouble = new Double(99.9);
        double unboxedDouble = boxedDouble;  // Unboxing
        System.out.println("Unboxed double: " + unboxedDouble);

        Character boxedChar = new Character('Z');
        char unboxedChar = boxedChar;  // Unboxing
        System.out.println("Unboxed char: " + unboxedChar);

        Boolean boxedBool = new Boolean(false);
        boolean unboxedBool = boxedBool;  // Unboxing
        System.out.println("Unboxed boolean: " + unboxedBool);
    }
}
