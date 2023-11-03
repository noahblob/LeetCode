public class Solution643 {
  public double findMaxAverage(int[] nums, int k) {
    double avg = Integer.MIN_VALUE;
    int newAvg = 0;
    int leftPointer = 0;
    for (int i = 0; i < nums.length; i++) {
      newAvg += nums[i];
      if (i >= k - 1) {

        avg = Math.max(newAvg, avg);

        newAvg -= nums[leftPointer];

        leftPointer++;

      }
    }
    return avg / k;
  }
}
