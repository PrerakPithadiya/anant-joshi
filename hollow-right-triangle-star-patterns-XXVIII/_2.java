public class _2 {
  public static void main(String[] args) {
    int n = 4;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i || i == n) {
          System.out.print(i + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
