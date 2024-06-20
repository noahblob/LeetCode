public class Solution81 {
  public boolean search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (nums[mid] == target) {
        return true;
      }
      if (nums[left] == nums[mid]) {
        left++;
      } else if (nums[left] < nums[mid]) { // left half of array
        if (nums[left] <= target && nums[mid] >= target) {
          // number is within range of target, decrease right pointer
          right = mid - 1;
        } else {
          // number is out of range of target, increase left pointer
          left = mid + 1;
        }
      } else { // nums[left] > nums[mid] right half of array
        if (nums[mid] <= target && nums[right] >= target) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }

    return false;
  }
}
