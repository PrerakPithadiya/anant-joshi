public class Main {
  public static void main(String[] args) {
    int n = 9;
    int a = 1;
    for (int i = 1; i <= n - 1; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
          System.out.print(a + " ");
        } else {
          System.out.print("  ");
        }
      }
      a = a * 2;
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      if (i < n / 2 + 1) {
        a = a / 2;
      } else {
        a = a * 2;
      }
    }
  }
}
