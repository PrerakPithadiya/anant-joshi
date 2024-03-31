public class _1 {
  public static void main(String[] args) {
    int n = 7;

    int a = 1, b = 2, c = n, d = n - 1, e = 2, f = n - 1;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1) {
          System.out.print(a++ + " ");
        } else if (i == n) {
          System.out.print(c-- + " ");
        } else if (j == 1) {
          System.out.print(b++ + " ");
        } else if (j == n) {
          System.out.print(d-- + " ");
        } else if (j == i) {
          System.out.print(e + " ");
          if (i < n / 2 + 1)
            e++;
          else
            e--;
          if (j == n + 1 - i)
            f++;
        } else if (j == n + 1 - i) {
          System.out.print(f + " ");
          if (i < n / 2 + 1)
            f--;
          else
            f++;
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
