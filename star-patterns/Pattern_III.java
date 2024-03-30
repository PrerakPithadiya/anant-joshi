package Patterns.Star_Patterns;

import java.util.Scanner;

public class Pattern_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user to input the number of rows
        System.out.print("Enter the Number of Rows : ");
        int n = sc.nextInt();

        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Loop for printing spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Printing double spaces
            }
            // Loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Printing a star followed by a space
            }
            System.out.println(); // Moving to the next line after printing stars for the current row
        }
    }
}