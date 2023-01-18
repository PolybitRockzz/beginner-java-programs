package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Initialize a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for the number of terms they want to generate
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        // Check for invalid input
        if (n < 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }
        
        // Call the fibonacci method to calculate and print the terms
        fibonacci(n);

        // Close Scanner object
        sc.close();
    }
    
    // Method to calculate and print the Fibonacci sequence
    public static void fibonacci(int n) {
        // Base case: 0 and 1 are the first two terms of the sequence
        if (n == 0) {
            System.out.println("0");
            return;
        } else if (n == 1) {
            System.out.println("0 1");
            return;
        }
        
        // Initialize variables to store the first two terms
        int a = 0;
        int b = 1;
        
        // Print the first two terms
        System.out.print("0 1 ");
        
        // Loop to calculate and print the remaining terms
        for (int i = 2; i < n; i++) {
            // Current term is the sum of the previous two terms
            int c = a + b;
            
            // Print the current term
            System.out.print(c + " ");
            
            // Update the previous two terms
            a = b;
            b = c;
        }
    }
}
