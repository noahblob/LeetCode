public class Solution153 {
  public int findMin(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int mid = (left + right) / 2;

      if (nums[right] < nums[left]) {
        if (nums[right] >= nums[mid]) {
          right = mid;
        } else if (nums[right] < nums[mid]) {
          left = mid + 1;
        }
      } else {
        return nums[left];
      }
    }
    return nums[left];
  }
}
