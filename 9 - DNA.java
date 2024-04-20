package Anant_Joshi; // Replace Your_Name with your actual name or identifier

import java.util.Random;

class DNASequenceGenerator {
    public static void main(String[] args) throws InterruptedException {
        int startingSpaces = 1;
        int sequenceLength = 20;
        short sleepTime = 200;
        boolean increasing = true;
        int maxSpaces = 10; // Maximum number of spaces

        while (true) {
            char base1 = getRandomBase();
            char base2 = getComplementaryBase(base1);

            for (int i = 0; i < startingSpaces; ++i) {
                System.out.print(" ");
            }

            System.out.print(base1);

            for (int i = 0; i < sequenceLength; ++i) {
                System.out.print("_");
            }

            System.out.print(base2 + "\n");

            // Adjust starting spaces and sequence length
            if (increasing) {
                startingSpaces++;
                sequenceLength -= 2;
            } else {
                startingSpaces--;
                sequenceLength += 2;
            }

            // Toggle direction when reaching boundaries
            if (startingSpaces >= maxSpaces) {
                increasing = false;
            } else if (startingSpaces <= 1) {
                increasing = true;
            }

            // Sleep for a short interval
            Thread.sleep(sleepTime);
        }
    }

    // Method to generate a random DNA base
    private static char getRandomBase() {
        int randomNumber = new Random().nextInt(4);
        return switch (randomNumber) {
            case 0 -> 'A';
            case 1 -> 'T';
            case 2 -> 'G';
            default -> 'C';
        };
    }

    // Method to get the complementary base
    private static char getComplementaryBase(char base) {
        return switch (base) {
            case 'A' -> 'T';
            case 'T' -> 'A';
            case 'G' -> 'C';
            default -> 'G';
        };
    }
}