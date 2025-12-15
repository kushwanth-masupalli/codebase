import java.util.Scanner;

public class ScannerFullDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Primitive Type Inputs ---

        System.out.print("Enter a byte value (-128 to 127): ");
        byte byteVal = scanner.nextByte();

        System.out.print("Enter a short value (-32,768 to 32,767): ");
        short shortVal = scanner.nextShort();

        System.out.print("Enter an int value: ");
        int intVal = scanner.nextInt();

        System.out.print("Enter a long value: ");
        long longVal = scanner.nextLong();

        System.out.print("Enter a float value: ");
        float floatVal = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleVal = scanner.nextDouble();

        // Handle the leftover newline before using nextLine()
        scanner.nextLine();

        System.out.print("Enter a single character: ");
        char charVal = scanner.next().charAt(0);

        // Handle leftover newline before using nextLine() again
        scanner.nextLine();

        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanVal = scanner.nextBoolean();

        // Handle leftover newline before using nextLine()
        scanner.nextLine();

        // --- next() vs nextLine() Demo ---

        System.out.print("Enter a single word (no spaces): ");
        String singleWord = scanner.next();  // reads one word

        scanner.nextLine(); // clear leftover newline

        System.out.print("Enter a full sentence: ");
        String fullSentence = scanner.nextLine();  // reads entire line

        // --- Output All Values ---

        System.out.println("\n--- You Entered ---");
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("boolean: " + booleanVal);
        System.out.println("single word (next): " + singleWord);
        System.out.println("full sentence (nextLine): " + fullSentence);

        scanner.close();
    }
}
