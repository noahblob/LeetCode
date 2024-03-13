public class Solution1493 {
  public int longestSubarray(int[] nums) {
    int numZeroes = 0;
    int p1 = 0;
    int p2 = 0;
    int maxSubLength = 0;

    while (p2 < nums.length) {
      if (nums[p2] == 0) {
        numZeroes++;
      }

      while (numZeroes > 1) {
        if (nums[p1] == 0) {
          numZeroes--;
        }
        p1++;
      }

      maxSubLength = Math.max(maxSubLength, p2 - p1 + 1 - numZeroes);
      p2++;
    }
    return (maxSubLength == nums.length) ? maxSubLength - 1 : maxSubLength;
  }
}
