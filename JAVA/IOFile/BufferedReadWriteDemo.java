package IOFile;
import java.io.BufferedReader;  

import java.io.*;

public class BufferedReadWriteDemo {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // Writing to the file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, this is the first line.");
            writer.newLine();
            writer.write("This is the second line.");
            writer.newLine();
            writer.write("BufferedWriter makes writing efficient!");
            System.out.println("Writing to file completed.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from the file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
