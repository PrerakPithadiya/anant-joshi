package Patterns.Star_Patterns;

import java.util.Scanner;

public class Pattern_XIV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to input the number of rows
        System.out.println("Enter the Number of Rows : ");
        int numRows = scanner.nextInt();

        int numSpaces = 0; // Number of spaces to be printed in each row
        int numStars = numRows; // Number of stars to be printed in each row

        // Loop for printing the pattern
        for (int i = 1; i <= 2 * numRows - 1; i++) {
            // Print spaces
            for (int j = 1; j <= numSpaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= numStars; j++) {
                System.out.print("* ");
            }

            // Adjust the number of spaces and stars for the next row
            if (i < numRows) {
                numSpaces++; // Increase number of spaces and decrease number of stars for upper half of the pattern
                numStars--;
            } else {
                numSpaces--; // Decrease number of spaces and increase number of stars for lower half of the pattern
                numStars++;
            }

            System.out.println(); // Move to the next line after printing each row
        }
    }
}
