public class Solution169 {
  public int majorityElement(int[] nums) {
    int count = 0;
    int majority = nums[0];
    for (int i = 0; i < nums.length; i++) {
      int cnt = 0;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          cnt++;
        }
      }
      if (cnt > count) {
        count = cnt;
        majority = nums[i];
      }
    }
    return majority;
  }
}
