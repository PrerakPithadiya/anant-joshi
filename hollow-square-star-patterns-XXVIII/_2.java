public class _2 {
  public static void main(String[] args) {
    int n = 5;

    if (n == 1) {
      System.out.println("1");
      return;
    }

    for (int i = 1; i <= n; i++) {
      if (i < n) {
        System.out.print("1 ");
      } else {
        System.out.print("4 ");
      }
    }
    System.out.println();

    for (int i = 1; i <= n - 2; i++) {
      for (int j = 1; j <= n; j++) {
        if (j == 1) {
          System.out.print("2 ");
        } else if (j == n) {
          System.out.print("4 ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    for (int i = 1; i <= n; i++) {
      if (i == 1) {
        System.out.print("2 ");
      } else {
        System.out.print("3 ");
      }
    }
  }
}
