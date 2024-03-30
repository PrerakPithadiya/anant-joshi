package Patterns.Star_Patterns;

import java.util.Scanner;

public class Pattern_IV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to input the number of rows
        System.out.println("Enter the Number of Rows : ");
        int numRows = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= numRows; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= numRows + 1 - i; j++) {
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
