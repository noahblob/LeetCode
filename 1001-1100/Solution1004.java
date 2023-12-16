public class Solution1004 {
  public int longestOnes(int[] nums, int k) {
    /*
     * At each window, check if k = # zeroes in that window,
     * this will achieve the most max consecutive ones
     */
    int n = nums.length;
    int out = 0;
    int leftPointer = 0;

    for (int i = 0; i < n; i++) {

      if (nums[i] == 0) {
        k--;
      }

      // if we have found max number of zeroes, find first occurrence of 0
      // and restart our window from there
      while (leftPointer < i && k < 0) {
        if (nums[leftPointer] == 0) {
          k++;
        }
        leftPointer++;
      }

      // max length window will either be what we already have,
      // or what the next window we found is.
      if (k >= 0) {
        out = Math.max(out, i - leftPointer + 1);
      }
    }

    return out;
  }
}
