package Operators;

public class Shift_Operators {
    public static void main(String[] args) {
        int a = 8;  // Binary: 0000 1000

        System.out.println("Original number a = " + a);

        // 1. Left Shift (<<)
        int leftShift = a << 2; // Shift left by 2 bits (multiply by 2^2 = 4)
        System.out.println("a << 2 = " + leftShift); // 32

        // 2. Right Shift (>>)
        int rightShift = a >> 2; // Shift right by 2 bits (divide by 2^2 = 4)
        System.out.println("a >> 2 = " + rightShift); // 2

        // 3. Unsigned Right Shift (>>>)
        int b = -8;  // Negative number in binary
        int unsignedRightShift = b >>> 2;
        System.out.println("b = -8");
        System.out.println("b >>> 2 = " + unsignedRightShift); // large positive number

        // Bonus: show binary representations
        System.out.println("\nBinary representations:");
        System.out.println("a in binary:        " + Integer.toBinaryString(a));
        System.out.println("a << 2 in binary:   " + Integer.toBinaryString(leftShift));
        System.out.println("a >> 2 in binary:   " + Integer.toBinaryString(rightShift));
        System.out.println("b in binary:        " + Integer.toBinaryString(b));
        System.out.println("b >>> 2 in binary:  " + Integer.toBinaryString(unsignedRightShift));
    }
}
