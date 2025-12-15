package Exceptions;
import java.io.FileReader;
import java.io.IOException;
/*
 * ✅          Rule About throws in Java
    If a method declares a checked exception using the throws keyword, then any code
    that calls that method must either handle the exception with try-catch, or declare
    it again using throws
 */

public class Throws {

    // Method that declares it might throw IOException
    static void readFile() throws IOException {
        FileReader fr = new FileReader("data.txt");  // May throw FileNotFoundException
        System.out.println("File opened successfully.");
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile();  // We must handle or declare the exception
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program completed.");
    }
}


