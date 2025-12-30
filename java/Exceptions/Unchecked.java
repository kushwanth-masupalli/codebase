package Exceptions;

public class Unchecked {
    // Unchecked exceptions are also called runtime exceptions
    @SuppressWarnings("null")
    public static void main(String[] args) {
        System.out.println("Program started.");

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // Throws ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }

        try {
            String text = null;
            System.out.println(text.length());  // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught another unchecked exception: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
