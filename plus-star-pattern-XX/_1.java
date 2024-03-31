public class _1 {
  public static void main(String[] args) {
    int n = 5;

    for (int i = 1; i <= 2 * n - 1; i++) {
      for (int j = 1; j <= 2 * n - 1; j++) {
        if (j == n) {
          if (i % 2 != 0)
            System.out.print("1 ");
          else
            System.out.print("0 ");
        } else if (i == n) {
          if (j % 2 != 0)
            System.out.print("1 ");
          else
            System.out.print("0 ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
