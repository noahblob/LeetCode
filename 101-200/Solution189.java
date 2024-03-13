public class Solution189 {
  public void rotate(int[] nums, int k) {
    if (nums.length <= 1) {
      return;
    }
    k %= nums.length;
    int[] endNums = new int[k];
    int pointer = 0;

    // store last k elements
    for (int i = nums.length - k; i < nums.length; i++) {
      endNums[pointer] = nums[i];
      pointer++;
    }

    // shift array after first k elements
    for (int i = nums.length - k - 1; i >= 0; i--) {
      nums[i + k] = nums[i];
    }

    // put back last k elements at front
    for (int i = 0; i < endNums.length; i++) {
      nums[i] = endNums[i];
    }
  }
}
