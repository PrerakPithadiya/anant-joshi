package Patterns.Star_Patterns;

import java.util.Scanner;

public class Pattern_XXI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user to input the number of rows
        System.out.println("Enter the Number of Rows : ");
        int n = sc.nextInt();

        // Loop to iterate through each row
        for (int i = 1; i <= n; i++) {
            // Loop to iterate through each column
            for (int j = 1; j <= n; j++) {
                // Printing '*' if:
                // - Current row is the first row
                // - Current row is the last row
                // - Current column is the first column
                // - Current column is the last column
                // - Current column equals current row number
                // - Current column equals n + 1 minus current row number
                if (i == 1 || i == n || j == 1 || j == n || j == i || j == n + 1 - i) {
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