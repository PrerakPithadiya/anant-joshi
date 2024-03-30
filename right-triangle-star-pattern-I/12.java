import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Print numbers in descending order for each row
            for (int j = rows - i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
        scanner.close();
    }
}
