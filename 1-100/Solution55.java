public class Solution55 {
  public boolean canJump(int[] nums) {
    // element at very last index is not relevant
    // cannot possibly start from 0
    int p1 = 0;

    for (int i = 0; i < nums.length; i++) {
      // p1 represents the next reachable index,
      // if i exceeds p1, we cannot reach index i
      // therefore, we cannot jump to it
      if (i > p1) {
        return false;
      }

      p1 = Math.max(p1, nums[i] + i);
    }

    return true;
  }
}
