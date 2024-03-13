public class Solution33 {
  public int search(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;

    while (l <= r) {
      int mid = (l + r) / 2;

      if (nums[mid] == target) {
        return mid;
      }

      // first half of array is sorted
      if (nums[l] <= nums[mid]) {
        // update pointers whether target is within range or outside of range
        if (nums[l] <= target && nums[mid] > target) {
          r = mid - 1;
        } else { // target is outside of range, move left pointer forward
          l = mid + 1;
        }
      } else { // nums[l] > nums[mid] second half of array is sorted
        if (nums[mid] < target && nums[r] >= target) {
          l = mid + 1;
        } else {
          r = mid - 1;
        }
      }
    }

    return -1;
  }
}
