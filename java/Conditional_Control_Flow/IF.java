package Conditional_Control_Flow;

public class IF{
    public static void main(String[] args) {
        int age = 20;

        // 1. Simple if
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // 2. if-else
        if (age >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You cannot vote.");
        }

        // 3. if-else if-else
        int marks = 72;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // 4. Nested if
        boolean hasID = true;
        if (age >= 18) {
            if (hasID) {
                System.out.println("Entry allowed.");
            } else {
                System.out.println("ID is required.");
            }
        } else {
            System.out.println("You are underage.");
        }
    }
}
