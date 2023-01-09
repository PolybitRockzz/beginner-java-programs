/* 
 * Question: 
 * Write a program for a function that takes in a string as input and returns 
 * a boolean value indicating whether the string is a palindrome or not.
 * A palindrome is a word, phrase, number, or other sequence of characters that
 * reads the same forwards and backwards, ignoring punctuation, capitalization, and spaces.
*/

package Recursion;
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String string) {
        // Check if the string is the same forwards and backwards
        return string.equals(new StringBuilder(string).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(string)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
