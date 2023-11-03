public class Solution1732 {
  public int largestAltitude(int[] gain) {
    int start = 0;
    int max = 0;

    for (int x : gain) {
      start += x;
      max = Math.max(start, max);
    }

    return max;
  }
}
