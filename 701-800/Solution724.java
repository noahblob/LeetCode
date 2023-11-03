public class Solution724 {
  public int pivotIndex(int[] nums) {
    int n = nums.length;
    int totalSum = 0;
    int leftSum = 0;
    for (int num : nums) {
      totalSum += num;
    }
    for (int i = 0; i < n; leftSum += nums[i++]) {
      if (leftSum * 2 == totalSum - nums[i]) {
        return i;
      }
    }

    return -1;

  }
}
