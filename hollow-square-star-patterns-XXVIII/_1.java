public class _1 {
  public static void main(String[] args) {
    int n = 5;
    int a = 2;
    int b = n - 1;

    for (int i = 1; i <= n; i++) {
      System.out.print(i + " ");
    }
    System.out.println();

    for (int i = 1; i <= n - 2; i++) {
      for (int j = 1; j <= n; j++) {
        if (j == 1) {
          System.out.print(a++ + " ");
        } else if (j == n) {
          System.out.print(b-- + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    for (int i = n; i >= 1; i--) {
      System.out.print(i + " ");
    }

  }
}
