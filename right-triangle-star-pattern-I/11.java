import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print '1' for the start of each row
            System.out.print("1 ");
            // Print '0' for the remaining spaces in each row
            for (int j = 1; j < i; j++) {
                System.out.print("0 ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
        scanner.close();
    }
}
