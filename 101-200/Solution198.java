class Solution198 {
  public int rob(int[] nums) {
    int ans = 0;
    int oneBehind = 0;
    int twoBehind = 0;
    for (int num : nums) {
      ans = Math.max(oneBehind, twoBehind + num);
      twoBehind = oneBehind;
      oneBehind = ans;
    }
    return ans;
  }
}