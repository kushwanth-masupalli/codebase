package Operators;

public class UnaryOperatorsDemo {
    public static void main(String[] args) {
        // 1. Unary Plus and Minus
        int a = 10;
        System.out.println("Unary Plus: +" + a + " = " + (+a));
        System.out.println("Unary Minus: -" + a + " = " + (-a));

        // 2. Increment Operators
        int x = 5;
        System.out.println("\nInitial value of x: " + x);
        System.out.println("Prefix Increment (++x): " + (++x)); // 6
        System.out.println("Postfix Increment (x++): " + (x++)); // 6
        System.out.println("After Postfix Increment: " + x); // 7

        // 3. Decrement Operators
        int y = 7;
        System.out.println("\nInitial value of y: " + y);
        System.out.println("Prefix Decrement (--y): " + (--y)); // 6
        System.out.println("Postfix Decrement (y--): " + (y--)); // 6
        System.out.println("After Postfix Decrement: " + y); // 5

        // 4. Logical NOT
        boolean isJavaFun = true;
        System.out.println("\nLogical NOT (!isJavaFun): " + (!isJavaFun)); // false

        // 5. Bitwise Complement
        int num = 5; // 00000101 in binary
        System.out.println("\nBitwise Complement (~5): " + (~num)); // -6 (inverts bits)
    }
}
