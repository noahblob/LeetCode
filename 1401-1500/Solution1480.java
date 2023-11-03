public class Solution1480 {
  public int[] runningSum(int[] nums) {
    int currentSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      currentSum += nums[i];
      nums[i] = currentSum;
    }
    return nums;
  }
}
