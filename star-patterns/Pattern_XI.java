package Patterns.Star_Patterns;

import java.util.Scanner;

public class Pattern_XI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user to input the number of rows
        System.out.println("Enter the Number of Rows : ");
        int n = sc.nextInt();

        // Print the top row with 2*n-1 asterisks
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Initialize variables for stars and spaces in subsequent rows
        int nsp = 1;
        int nst = n - 1;

        // Loop to print upper part of the pattern
        for (int i = 1; i <= 2 * n - 3; i++) {
            // Print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            // Print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            // Update star and space counts for the next row
            if (i < n - 1) {
                nst--;
                nsp += 2;
            } else {
                nst++;
                nsp -= 2;
            }
            // Move to the next line after each row is printed
            System.out.println();
        }

        // Print the bottom row with 2*n-1 asterisks
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
    }
}