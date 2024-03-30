package Patterns.Star_Patterns;

import java.util.Scanner;

public class Pattern_XXIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user to input the number of rows
        System.out.println("Enter the Number of Rows : ");
        int n = sc.nextInt();

        // Loop to iterate through each row
        for (int i = 1; i <= n; i++) {
            // Loop to iterate through each column
            for (int j = 1; j <= n; j++) {
                // Printing '*' if it's the first row, last row, or columns at n/2 and n/2+2
                if (i == 1 || i == n || j == n / 2 || j == n / 2 + 2) {
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
