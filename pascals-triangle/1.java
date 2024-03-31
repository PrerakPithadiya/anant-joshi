public class 1 {
  public static void main(String[] args) {
    int n = 11;
    int val = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      val = 1;
      for (int j = 1; j <= i; j++) {
        if (j > 1) {
          val = val * (i - j + 1) / (j - 1);
        }
        System.out.print(val + " ");
      }
      System.out.println();
    }
  }
}
