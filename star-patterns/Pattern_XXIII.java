package Patterns.Star_Patterns;

import java.util.Scanner;

public class Pattern_XXIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user to input the number of rows
        System.out.println("Enter the Number of Rows : ");
        int n = sc.nextInt();

        // Loop to iterate through each row
        for (int i = 1; i <= n; i++) {
            // Loop to print spaces before printing '*'
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Loop to iterate through each column
            for (int j = 1; j <= i; j++) {
                // Printing '*' if it's the first column, last column, or the last row
                if (j == 1 || j == i || i == n) {
                    System.out.print("* ");
                } else {
                    // Printing spaces otherwise
                    System.out.print("  ");
                }
            }
            // Moving to the next line after each row is printed
            System.out.println();
        }
    }
}