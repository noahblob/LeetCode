public class Solution70 {
  public int climbStairs(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 2) {
      return 2;
    }

    int sum = 2;
    int[] a = new int[n];
    a[0] = 0;
    a[1] = 1;

    for (int i = 2; i < n; i++) {
      a[i] = a[i - 1] + a[i - 2];
      sum += a[i];
    }
    return sum;

  }
}
