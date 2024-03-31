public class _3 {
  public static void main(String[] args) {
    int n = 4;
    int a = 1;
    int b = n + (n - 1) + (n - 2);
    int c = n + 1;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (j == 1) {
          System.out.print(a++ + " ");
        } else if (j == i) {
          System.out.print(b-- + " ");
        } else if (i == n && j > 1) {
          System.out.print(c++ + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
