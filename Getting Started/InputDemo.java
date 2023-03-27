// This is a comment. It is ignored by the program.
// This program demonstrates how to read user input in Java.

import java.util.Scanner; // We need to import the Scanner class to read user input.

public class InputDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console.
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number.
        System.out.print("Enter a number: ");
        
        // Read the user's input as a double value.
        double number = scanner.nextDouble();
        
        // Print the value of the "number" variable back to the console.
        System.out.println("You entered the number: " + number);
        
        // Close the Scanner object to free up system resources.
        scanner.close();
    }
}
