package Exceptions;

// Custom checked exception
class AgeInvalidException extends Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}

public class CustomeException {

    // Method that throws the custom exception
    static void validateAge(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);  // This will throw the custom exception
        } catch (AgeInvalidException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling the custom exception.");
    }
}
