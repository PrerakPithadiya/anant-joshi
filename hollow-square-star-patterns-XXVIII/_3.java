public class _3 {
  public static void main(String[] args) {
    int n = 5;  // the number of rows must be odd otherwise the output not display properly

    
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n) {
          if (j % 2 != 0) {
            System.out.print("1 ");
          } else {
            System.out.print("0 ");
          }
        } else if (j == 1 || j == n) {
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
  }
}
