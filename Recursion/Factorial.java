/* 
 * Question: 
 * Please provide a program that, when given an input number, calculates and 
 * returns the factorial of that number. A factorial is the product of an integer 
 * and all the integers below it. 
 * For example, the factorial of 4 is 4 * 3 * 2 * 1 = 24. 
*/

package Recursion;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int num = sc.nextInt(); // read in the number from the user
        
        int result = calculateFactorial(num); // call the recursive function to calculate the factorial
        System.out.println("The factorial of " + num + " is: " + result);

        sc.close();
    }
    
    // recursive function to calculate the factorial of a given number
    public static int calculateFactorial(int n) {
        // base case: if n is 0 or 1, the factorial is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // recursive case: the factorial of n is equal to n times the factorial of n-1
        else {
            return n * calculateFactorial(n - 1);
        }
    }
}
