package Conditional_Control_Flow;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("Demo of break:");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Break at i = " + i);
                break;  // exit the loop completely
            }
            System.out.println("Value: " + i);
        }

        System.out.println("\nDemo of continue:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Continue at i = " + i);
                continue;  // skip rest of loop body for even i
            }
            System.out.println("Value: " + i);
        }
    }
}

