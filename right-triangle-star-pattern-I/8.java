import java.util.Scanner;

public class LetterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Variable to hold the starting character
        char currentChar = 'A';
        
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print the letters in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar++; // Move to the next character
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
        scanner.close();
    }
}
