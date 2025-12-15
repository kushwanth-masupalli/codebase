package Conditional_Control_Flow;

public class Loops {
    public static void main(String[] args) {
        // 1. For loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " "); // Output: 1 2 3 4 5
        }
        System.out.println("\n");

        // 2. While loop
        System.out.println("While loop:");
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " "); // Output: 1 2 3 4 5
            j++;
        }
        System.out.println("\n");

        // 3. Do-while loop
        System.out.println("Do-while loop:");
        int k = 1;
        do {
            System.out.print(k + " "); // Output: 1 2 3 4 5
            k++;
        } while (k <= 5);
        System.out.println("\n");

        // 4. Enhanced for loop (for-each) - works with arrays/collections
        System.out.println("Enhanced for loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.print(num + " "); // Output: 10 20 30 40 50
        }
        System.out.println();
    }
}
