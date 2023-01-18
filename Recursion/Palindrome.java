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
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        } else if (str.charAt(start) != str.charAt(end)) {
            return false;
        } else {
            return isPalindrome(str, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        input.close();
    }
}