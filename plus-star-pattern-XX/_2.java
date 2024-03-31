public class _2 {
  public static void main(String[] args) {
    int n = 4;

    int a = 1;
    int b = 1;

    for (int i = 1; i <= 2 * n - 1; i++) {
      for (int j = 1; j <= 2 * n - 1; j++) {
        if (j == n) {
          System.out.print(a + " ");
          if (i < n)
            a++;
          else
            a--;
          if (i == n)
            b--;
        } else if (i == n) {
          System.out.print(b + " ");
          if (j < n)
            b++;
          else
            b--;
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
