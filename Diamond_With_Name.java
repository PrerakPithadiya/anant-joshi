package anant_joshi;

import java.util.Scanner;

public class Diamond_With_Name {
    final static String background_RED = "\u001b[41m"; // 43 - yellow
    final static String background_BLUE = "\u001b[44m";  // 45 - pink
    final static String reset = "\u001b[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int n = sc.nextInt();
        System.out.print("Enter the String : ");
        String str = sc.next();

        if (n % 2 == 0) {
            n++;
        }

        int outerSpaces = n / 2;
        int nst = n / 2;
        int innerSpaces = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= outerSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print(background_RED + " " + reset);
                    } else {
                        System.out.print(background_BLUE + " " + reset);
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print(background_BLUE + " " + reset);
                    } else {
                        System.out.print(background_RED + " " + reset);
                    }
                }
            }
            if (i == n / 2 + 1) {
                for (int j = 1; j <= (innerSpaces - str.length()) / 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(str);
                int afterNameSpace = (innerSpaces - str.length()) / 2 + 1;
                if (str.length() % 2 == 0) {
                    afterNameSpace--;
                }
                for (int j = 1; j <= afterNameSpace; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j = 1; j <= innerSpaces; j++) {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= nst; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print(background_RED + " " + reset);
                    } else {
                        System.out.print(background_BLUE + " " + reset);
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print(background_BLUE + " " + reset);
                    } else {
                        System.out.print(background_RED + " " + reset);
                    }
                }
            }
            if (i < n / 2 + 1) {
                outerSpaces--;
                innerSpaces += 2;
            } else {
                outerSpaces++;
                innerSpaces -= 2;
            }
            System.out.println();
        }
    }
}