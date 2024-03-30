import java.util.Scanner;

public class VowelPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Define an array of vowels
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print the letters in each row
            for (int j = 0; j < i; j++) {
                System.out.print(vowels[j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
        scanner.close();
    }
}
