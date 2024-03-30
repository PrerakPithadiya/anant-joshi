import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        int num = 1; // Starting number for the pattern
        
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
        scanner.close();
    }
}
