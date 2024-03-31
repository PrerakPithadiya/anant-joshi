public class Main {
  public static void main(String[] args) {
    int n = 7;
    for (int i = 1; i <= n - 1; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
          if (i % 2 != 0) {
            System.out.print("1 ");
          } else {
            System.out.print("0 ");
          }
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        System.out.print("1 ");
      } else {
        System.out.print("0 ");
      }
    }
  }
}
