public class Solution643 {
  public double findMaxAverage(int[] nums, int k) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    int pointer = 0;

    for (int i = 0; i < nums.length; i++) {
      currentSum += nums[i];
      if (i >= k - 1) {
        maxSum = Math.max(currentSum, maxSum);
        currentSum -= nums[pointer];
        pointer++;
      }
    }

    return (double) maxSum / k;
  }
}
