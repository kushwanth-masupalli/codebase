package Operators;
public class Arithmetic_Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        
        // Addition: Adds two operands.
        int sum = a + b;  // sum = 10 + 5 = 15
        
        // Subtraction: Subtracts the second operand from the first.
        int difference = a - b;  // difference = 10 - 5 = 5
        
        // Multiplication: Multiplies two operands.
        int product = a * b;  // product = 10 * 5 = 50
        
        // Division: Divides the first operand by the second. 
        int quotient = a / b;  // quotient = 10 / 5 = 2
        
        // Modulus: Returns the remainder of division.
        int remainder = a % b;  // remainder = 10 % 5 = 0
        
        // Printing the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);


        int v = a++;
        System.out.println(v);
        int c = 10;
        int vv = ++c;           //demonstrating difference between post increment and pre increment
        System.out.println(vv);
    }
}
