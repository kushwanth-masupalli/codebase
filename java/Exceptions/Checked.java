package Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Checked {
    // Checked exceptions are also called compile-time exceptions
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("example.txt");  // File might not exist
            System.out.println("File opened successfully.");
            file.close();
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
        
        System.out.println("hello world!");
    } 
}
