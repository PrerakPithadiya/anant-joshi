package Anant_Joshi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class MagicSquareGenerator {
    private static final int SQUARE_SIZE = 3;
    private static final int MAX_RANDOM_NUMBER = 9;

    public static void main(String[] args) {
        int[][] magicSquare = new int[SQUARE_SIZE][SQUARE_SIZE];
        int[] numbersUsed = new int[MAX_RANDOM_NUMBER];
        int[] rowColumnDiagonalSums = new int[8];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Generating a Magic Square...\n");

        char continueGenerating;

        do {
            continueGenerating = 'y';

            // Reset sums and clear used numbers array
            resetSumsAndNumbersUsed(rowColumnDiagonalSums, numbersUsed);

            // Generate a magic square
            generateMagicSquare(magicSquare, numbersUsed);

            // Calculate row, column, and diagonal sums
            calculateSums(magicSquare, rowColumnDiagonalSums);

            // Check if it's a magic square
            boolean isMagicSquare = checkMagicSquare(rowColumnDiagonalSums);

            // If it's a magic square, print it
            if (isMagicSquare) {
                System.out.println("Generated Magic Square:");
                printMagicSquare(magicSquare);

                // Ask user if they want to generate another magic square
                System.out.print("\nGenerate another magic square? (Y/N): ");
                continueGenerating = scanner.next().charAt(0);
                System.out.println();
            }
        } while (continueGenerating == 'Y' || continueGenerating == 'y');

        scanner.close();
    }

    // Method to reset sums and clear used numbers array
    private static void resetSumsAndNumbersUsed(int[] sums, int[] numbersUsed) {
        for (int i = 0; i < 8; i++) {
            sums[i] = 0;
        }
        for (int i = 0; i < 9; i++) {
            numbersUsed[i] = 0;
        }
    }

    // Method to generate a magic square
    private static void generateMagicSquare(int[][] square, int[] numbersUsed) {
        int numUsedCount = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                square[i][j] = getRandomUniqueNumber(numbersUsed, numUsedCount);
                numbersUsed[numUsedCount++] = square[i][j];
            }
        }
    }

    // Method to get a random unique number
    private static int getRandomUniqueNumber(int[] numbersUsed, int numUsedCount) {
        Random random = new Random();
        int randomNumber;

        do {
            randomNumber = random.nextInt(9) + 1;
        } while (isNumberUsed(randomNumber, numbersUsed, numUsedCount));

        return randomNumber;
    }

    // Method to check if a number is already used
    private static boolean isNumberUsed(int number, int[] numbersUsed, int numUsedCount) {
        for (int i = 0; i < numUsedCount; i++) {
            if (number == numbersUsed[i]) {
                return true;
            }
        }
        return false;
    }

    // Method to calculate row, column, and diagonal sums
    private static void calculateSums(int[][] square, int[] sums) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sums[i] += square[i][j]; // Row sums
                sums[j + 3] += square[i][j]; // Column sums

                if (i == j) {
                    sums[6] += square[i][j]; // Diagonal from top-left to bottom-right
                }

                if (i + j == 2) {
                    sums[7] += square[i][j]; // Diagonal from top-right to bottom-left
                }
            }
        }
    }

    // Method to check if all sums are equal
    private static boolean checkMagicSquare(int[] sums) {
        for (int i = 1; i < 8; i++) {
            if (sums[i] != sums[0]) {
                return false;
            }
        }
        return true;
    }

    // Method to print the magic square
    private static void printMagicSquare(int[][] square) {
        for (int[] arr : square) {
            System.out.println(Arrays.toString(arr));
        }
    }
}