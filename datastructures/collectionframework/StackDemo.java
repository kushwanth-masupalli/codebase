package collectionframework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // 1. Create a Stack
        Stack<Integer> stack = new Stack<>();

        // 2. Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack);

        // 3. Peek (view top element)
        System.out.println("Top element using peek(): " + stack.peek());

        // 4. Pop (remove top element)
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after pop: " + stack);

        // 5. Check if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // 6. Search for element (1-based position from top)
        stack.push(40);
        stack.push(50);
        System.out.println("Stack: " + stack);
        System.out.println("Position of 20 (from top): " + stack.search(20));
        System.out.println("Position of 50 (from top): " + stack.search(50));

        // 7. Iterating stack elements
        System.out.print("Iterating stack: ");
        for (int val : stack) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 8. Clear stack
        stack.clear();
        System.out.println("Stack after clear(): " + stack);
    }
}
