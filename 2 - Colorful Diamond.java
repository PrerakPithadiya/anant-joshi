package Anant_Joshi;

import java.util.Scanner;

class Colorful_Diamond {
    final static String bgyellow = "\u001b[41m"; // \u001b[43m - yellow
    final static String bgpink = "\u001b[44m";  // \u001b[45m - pink
    final static String reset = "\u001b[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int n = sc.nextInt();

        int nsp = n - 1;
        int nst = 1;
        int a = 1;
        int b = 4;
        boolean con1 = false;
        boolean con2 = false;

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                if (i == a) {
                    con1 = true;
                    if (j % 2 != 0) {
                        System.out.print(bgyellow + "    " + reset);
                    } else {
                        System.out.print(bgpink + "    " + reset);
                    }
                } else if (i == b) {
                    con2 = true;
                    if (j % 2 != 0) {
                        System.out.print(bgyellow + "    " + reset);
                    } else {
                        System.out.print(bgpink + "    " + reset);
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print(bgpink + "    " + reset);
                    } else {
                        System.out.print(bgyellow + "    " + reset);
                    }
                }
            }
            if (con1) {
                a += 4;
            } else if (con2) {
                b += 4;
            }
            con1 = con2 = false;
            if (i < n) {
                nsp--;
                nst++;
            } else {
                nsp++;
                nst--;
            }
            System.out.println();
        }
    }
}