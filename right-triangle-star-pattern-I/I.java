import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Loop to iterate through each row
        for (int i = 1; i <= n; i++) {
            // Loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row is printed
        }
    }
}
