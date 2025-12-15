package Operators;

public class Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // AND (&&): Returns true if both operands are true.
        boolean andResult = (a && b);  // andResult = false (since b is false)

        // OR (||): Returns true if at least one of the operands is true.
        boolean orResult = (a || b);   // orResult = true (since a is true)

        // NOT (!): Reverses the logical state of its operand. If the operand is true, it becomes false, and vice versa.
        boolean notResult = !a;        // notResult = false (since a is true)

        // Printing the results
        System.out.println("a && b: " + andResult);
        System.out.println("a || b: " + orResult);
        System.out.println("!a: " + notResult);
    }
}
