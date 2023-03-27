// This is a comment. It is ignored by the program.
// This program is a simple calculator that performs basic arithmetic operations on two input numbers.

import java.util.Scanner; // We need to import the Scanner class to read user input.

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console.
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number.
        System.out.print("Enter the first number: ");
        
        // Read the user's input as a double value.
        double num1 = scanner.nextDouble();
        
        // Prompt the user to enter the second number.
        System.out.print("Enter the second number: ");
        
        // Read the user's input as a double value.
        double num2 = scanner.nextDouble();
        
        // Perform arithmetic operations on the input numbers.
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        
        // Print the results of the arithmetic operations to the console.
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        
        // Close the Scanner object to free up system resources.
        scanner.close();
    }
}
