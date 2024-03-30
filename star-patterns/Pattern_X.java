package Patterns.Star_Patterns;

import java.util.Scanner;

public class Pattern_X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to input the number of rows
        System.out.println("Enter the Number of Rows : ");
        int numRows = scanner.nextInt();

        // Number of stars in the first row
        int numStarsFirstRow = 2 * numRows - 1;

        // Print the first row with all stars
        for (int i = 1; i <= numStarsFirstRow; i++) {
            System.out.print("* ");
        }
        System.out.println(); // Move to the next line after printing the first row

        int numSpaces = 1; // Number of spaces between stars

        // Outer loop for remaining rows
        for (int row = 1; row <= numRows - 1; row++) {
            int numStars = numRows - row; // Number of stars in each part of the row

            // Print stars on the left side of the row
            for (int j = 1; j <= numStars; j++) {
                System.out.print("* ");
            }

            // Print spaces between stars
            for (int j = 1; j <= numSpaces; j++) {
                System.out.print("  ");
            }

            // Print stars on the right side of the row
            for (int j = 1; j <= numStars; j++) {
                System.out.print("* ");
            }

            numSpaces += 2; // Increase the number of spaces for the next row
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
