package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        // Initialize a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for the number of discs
        System.out.print("Enter the number of discs: ");
        int n = sc.nextInt();
        
        // Check for invalid input
        if (n < 1) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }
        
        // Call the solveTower method to solve the puzzle
        solveTower(n, "A", "C", "B");

        // Close Scanner object
        sc.close();
    }
    
    // Method to solve the Tower of Hanoi puzzle
    public static void solveTower(int n, String start, String end, String temp) {
        // Base case: if only one disc, move it from start to end peg
        if (n == 1) {
            System.out.println("Move disc 1 from " + start + " to " + end);
            return;
        }
        
        // Move all discs above the bottom disc from start to temp peg
        solveTower(n-1, start, temp, end);
        
        // Move the bottom disc from start to end peg
        System.out.println("Move disc " + n + " from " + start + " to " + end);
        
        // Move all discs from temp to end peg
        solveTower(n-1, temp, end, start);
    }
}
