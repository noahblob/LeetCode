public class Solution1464 {
  public int maxProduct(int[] nums) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    int maxIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
        maxIndex = i;
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (i != maxIndex && nums[i] > secondMax) {
        secondMax = nums[i];
      }
    }

    return (secondMax - 1) * (max - 1);
  }
}
