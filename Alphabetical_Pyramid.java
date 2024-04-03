package anant_joshi;

import java.util.Scanner;

public class Alphabetical_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character : ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter the Number of Rows : ");
        int n = sc.nextInt();

        int a = 1;
        boolean isUpper;
        isUpper = 'A' <= ch && ch <= 'Z';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (a == 1) {
                    System.out.print("\033[0;31m" + ch++ + " ");
                } else if (a == 2) {
                    System.out.print("\033[0;32m" + ch++ + " ");
                } else if (a == 3) {
                    System.out.print("\033[0;33m" + ch++ + " ");
                } else if (a == 4) {
                    System.out.print("\033[0;34m" + ch++ + " ");
                } else if (a == 5) {
                    System.out.print("\033[0;35m" + ch++ + " ");
                } else if (a == 6) {
                    System.out.print("\033[0;36m" + ch++ + " ");
                } else {
                    System.out.print("\033[0;29m" + ch++ + " ");
                }
                a++;
                if (a > 7) {
                    a = 1;
                }
                if (isUpper) {
                    ch = Character.toLowerCase(ch);
                } else {
                    ch = Character.toUpperCase(ch);
                }
                isUpper = !isUpper;
                if (ch == '{') {
                    ch = 'A';
                } else if (ch == '[') {
                    ch = 'a';
                }
            }
            System.out.println();
        }
    }
}