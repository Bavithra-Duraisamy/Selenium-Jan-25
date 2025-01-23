package week1.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Palindrome examples: 121, 12321, etc..
		
        int originalNumber = 12321;
        
        int reversedNumber = 0;
        int temp = originalNumber; // Store the original number
        
        // Reverse the number
        while (temp > 0) {
            int lastDigit = temp % 10;           // Get the last digit
            reversedNumber = reversedNumber * 10 + lastDigit; // Build reversed number
            temp = temp / 10;                   // Remove the last digit
        }
        
        // Check if the original number is equal to its reverse
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
        

	}

}
