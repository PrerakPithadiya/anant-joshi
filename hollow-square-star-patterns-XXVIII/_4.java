public class _4 {
  public static void main(String[] args) {
    int n = 5;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1) {
          System.out.print("1 ");
        } else if (i == n) {
          System.out.print(n + " ");
        } else if (j == 1 || j == n) {
          System.out.print(i + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
