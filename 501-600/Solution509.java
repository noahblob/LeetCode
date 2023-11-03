public class Solution509 {
  public int fib(int n) {
    if (n == 0) {
      return 0;
    }

    int current = 1;
    int next = 1;

    for (int i = 1; i < n; i++) {
      int temp = next;
      next = current + next;
      current = temp;
    }

    return current;
  }
}
