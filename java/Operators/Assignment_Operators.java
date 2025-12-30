package Operators;

public class Assignment_Operators {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;

        // Simple Assignment: Assigns the value on the right to the variable on the left.
        a = b;  // a = 5 (value of b is assigned to a)

        // Add and Assign: Adds the right operand to the left operand and assigns the result to the left operand.
        a += b;  // a = a + b, so a = 5 + 5 = 10

        // Subtract and Assign: Subtracts the right operand from the left operand and assigns the result to the left operand.
        a -= b;  // a = a - b, so a = 10 - 5 = 5

        // Multiply and Assign: Multiplies the left operand by the right operand and assigns the result to the left operand.
        a *= b;  // a = a * b, so a = 5 * 5 = 25

        // Divide and Assign: Divides the left operand by the right operand and assigns the result to the left operand.
        a /= b;  // a = a / b, so a = 25 / 5 = 5

        // Modulus and Assign: Divides the left operand by the right operand and assigns the remainder to the left operand.
        a %= b;  // a = a % b, so a = 5 % 5 = 0
        
        // Printing the results
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
