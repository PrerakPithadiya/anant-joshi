package Patterns.Star_Patterns;

import java.util.Scanner;

public class Pattern_XII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user to input the number of rows
        System.out.println("Enter the Number of Rows : ");
        int n = sc.nextInt();

        int nst = 1; // Number of stars in each row
        int nsp = 2 * n - 3; // Number of spaces between stars in each row

        // Loop to print upper part of the pattern
        for (int i = 1; i <= n - 1; i++) {
            // Loop to print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            // Loop to print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            // Loop to print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            // Updating star and space counts for the next row
            nst++;
            nsp -= 2;
            // Moving to the next line after each row is printed
            System.out.println();
        }

        // Loop to print the bottom part of the pattern
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
