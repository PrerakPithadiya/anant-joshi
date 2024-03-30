package Patterns.Star_Patterns;

import java.util.Scanner;

public class Pattern_XVIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user to input the number of rows
        System.out.println("Enter the Number of Rows : ");
        int n = sc.nextInt();

        int nst = n; // Number of stars
        int nsp = 0; // Number of spaces

        // Loop to iterate through each row
        for (int i = 1; i <= 2 * n - 1; i++) {
            // Loop to print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            // Loop to print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            // Adjusting space and star counts for each row
            if (i < n) {
                nsp++;
                nst--;
            } else {
                nsp--;
                nst++;
            }
            // Moving to the next line after each row is printed
            System.out.println();
        }
    }
}