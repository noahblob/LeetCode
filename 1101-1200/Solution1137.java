public class Solution1137 {
  public int tribonacci(int n) {
    // Tn = Tn+3 - Tn+1 - Tn+2
    if (n == 0) {
      return 0;
    } else if (n == 1 || n == 2) {
      return 1;
    } else { // n > 2
      int[] tn = new int[n + 1];
      tn[0] = 0;
      tn[1] = 1;
      tn[2] = 1;
      for (int i = 3; i <= n; i++) {
        tn[i] = tn[i - 1] + tn[i - 2] + tn[i - 3];
      }
      return tn[n];
    }
  }
}
