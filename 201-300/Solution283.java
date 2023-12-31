public class Solution283 {
  public void moveZeroes(int[] nums) {
    if (nums.length <= 1) {
      return;
    }

    int i = 0;

    for (int num : nums) {
      if (num != 0) {
        nums[i] = num;
        i++;
      }
    }

    while (i < nums.length) {
      nums[i] = 0;
      i++;
    }
  }
}
