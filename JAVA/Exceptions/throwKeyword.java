package Exceptions;

public class throwKeyword {

    // Method to check age for voting
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote.");  // Throwing an unchecked exception
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Program started.");

        try {
            checkAge(15);  // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program ended.");
    }
}
