public class Solution75 {
  public void sortColors(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] < nums[j]) {
          int high = nums[i];
          nums[i] = nums[j];
          nums[j] = high;
        }
      }
    }
  }
}
