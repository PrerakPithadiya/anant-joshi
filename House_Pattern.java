package anant_joshi;

public class House_Pattern {
    final static String background_YELLOW = "\u001b[41m";
    final static String background_RED = "\u001b[43m";
    static String black = "\u001b[30;1m";
    final static String reset = "\u001b[0m";

    public static void main(String[] args) {
        int roof = 8;
        int body = 20;
        int nst = 20;

        for (int i = 1; i <= roof; i++) {
            for (int j = 1; j <= roof - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print(background_YELLOW + black + "##" + reset);
            }
            nst += 2;
            System.out.println();
        }
        nst -= 2;

        for (int i = 1; i <= body; i++) {
            System.out.print("  ");
            for (int j = 1; j <= nst - 2; j++) {
                if ((i >= 8 && j >= 7 && j <= 15)) {
                    if (j == 11) {
                        System.out.print("| ");
                    } else if (i == 10 || i == 13 || i == 17 || i == 20) {
                        System.out.print("_ ");
                    } else {
                        System.out.print("  ");
                    }
                } else if ((i >= 8 && i <= 13 && j >= 21 && j <= 29)) {
                    if (j == 25) {
                        System.out.print("| ");
                    } else if (i == 10) {
                        System.out.print("_ ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print(background_RED + "  " + reset);
                }
            }
            System.out.println();
        }
    }
}