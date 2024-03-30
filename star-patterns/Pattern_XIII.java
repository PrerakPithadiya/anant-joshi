package Patterns.Star_Patterns;

import java.util.Scanner;

public class Pattern_XIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to input the number of rows
        System.out.println("Enter the Number of Rows : ");
        int numRows = scanner.nextInt();

        int numStars = 1; // Number of stars to be printed in each row

        // Loop for printing the pattern
        for (int i = 1; i <= 2 * numRows - 1; i++) {
            // Print stars
            for (int j = 1; j <= numStars; j++) {
                System.out.print("* ");
            }

            // Adjust the number of stars for the next row
            if (i < numRows) {
                numStars++; // Increase number of stars for upper half of the pattern
            } else {
                numStars--; // Decrease number of stars for lower half of the pattern
            }

            System.out.println(); // Move to the next line after printing each row
        }
    }
}
